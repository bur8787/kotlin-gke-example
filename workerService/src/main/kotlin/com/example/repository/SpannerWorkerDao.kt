package com.example.repository

import com.example.domain.Worker
import com.google.cloud.spanner.DatabaseClient
import com.google.cloud.spanner.DatabaseId
import com.google.cloud.spanner.Key
import com.google.cloud.spanner.KeySet
import com.google.cloud.spanner.Mutation
import com.google.cloud.spanner.SpannerOptions
import com.google.cloud.spanner.StructReader
import org.apache.commons.lang3.RandomStringUtils
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Repository
import java.util.Arrays
import java.util.Collections

@Repository
class SpannerWorkerDao(val client: DatabaseClient) : WorkerRepository {

    override fun create(m: Worker): Worker {
        m.id = RandomStringUtils.randomNumeric(8).toInt() // TODO: move domain
        val mutation = Mutation.newInsertBuilder("workers")
                .set("id")
                .to(m.id.toString())
                .set("name")
                .to(m.name)
                .build()
        client.write(Collections.singletonList(mutation))
        return m
    }

    override fun findAll(): Iterable<Worker> {
        val resultSet = client.singleUse().read(
                "workers",
                KeySet.all(),
                Arrays.asList("id", "name")
        )

        val workers = mutableListOf<Worker>()
        while (resultSet.next()) {
            workers.add(fromRow(resultSet))
        }
        return workers
    }

    override fun findById(k: Int): Worker {
        val row = client.singleUse().readRow(
                "workers",
                Key.of(k),
                Arrays.asList("id", "name"))
        return fromRow(row)
    }

    fun fromRow(struct: StructReader?): Worker {
        if (struct == null) {
            throw IllegalStateException()
        }
        return Worker(
                struct.getLong("id").toInt(),
                struct.getString("name")
        )
    }
}

@Configuration
@ConfigurationProperties(prefix = "spring.gcp.spanner")
class DatabaseClientConfig() {
    var instanceId: String = ""
    var database: String = ""

    @Bean
    fun client(): DatabaseClient {
        val options = SpannerOptions.newBuilder().build()
        val spanner = options.service
        val db = DatabaseId.of(options.projectId, this.instanceId, this.database)
        return spanner.getDatabaseClient(db)
    }
}
