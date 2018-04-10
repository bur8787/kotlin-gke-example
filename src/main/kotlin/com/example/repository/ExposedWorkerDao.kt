package com.example.repository

import com.example.Workers
import com.example.domain.Worker
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.statements.UpdateBuilder
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Repository

@Primary
@Repository
open class ExposedWorkerDao : WorkerRepository {
    override fun findAll() = Workers.selectAll().map { fromRow(it) }

    override fun findById(id: Int) = Workers.select { Workers.id eq id }.map { fromRow(it) }.get(0)

    override fun create(w: Worker): Worker {
        w.id = Workers.insert(toRow(w))[Workers.id]
        return w
    }

    private fun toRow(w: Worker): Workers.(UpdateBuilder<*>) -> Unit = {
        if (w.id != null) {
            it[id] = w.id!!
        }
        it[name] = w.name
    }

    private fun fromRow(r: ResultRow) =
            Worker(r[Workers.id],
                    r[Workers.name])
}