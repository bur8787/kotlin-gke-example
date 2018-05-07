package com.example.repository

import com.example.domain.Worker
import com.example.generated.jooq.Tables.WORKERS
import com.example.generated.jooq.tables.records.WorkersRecord
import org.jooq.DSLContext
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Primary
@Repository
@Transactional
open class JooqWorkerDao(private val context: DSLContext) : WorkerRepository {

    override fun findAll() = context.selectFrom(WORKERS).fetch().map { fromRow(it) }

    override fun findById(id: Int) = context.selectFrom(WORKERS).where(WORKERS.ID.eq(id)).fetchOne().map { fromRow(it as WorkersRecord) }

    override fun create(w: Worker) = context.insertInto(WORKERS).set(WORKERS.NAME, w.name).returning().fetchOne().map { fromRow(it as WorkersRecord) }

    private fun fromRow(r: WorkersRecord) = Worker(r.id, r.name)
}
