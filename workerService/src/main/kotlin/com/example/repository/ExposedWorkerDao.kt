package com.example.repository

import com.example.workers
import com.example.domain.Worker
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.statements.UpdateBuilder
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Primary
@Repository
@Transactional
open class ExposedWorkerDao : WorkerRepository {
    override fun findAll() = workers.selectAll().map { fromRow(it) }

    override fun findById(id: Int) = workers.select { workers.id eq id }.map { fromRow(it) }.get(0)

    override fun create(w: Worker): Worker {
        w.id = workers.insert(toRow(w))[workers.id]
        return w
    }

    private fun toRow(w: Worker): workers.(UpdateBuilder<*>) -> Unit = {
        if (w.id != null) {
            it[id] = w.id!!
        }
        it[name] = w.name
    }

    private fun fromRow(r: ResultRow) =
            Worker(r[workers.id],
                    r[workers.name])
}