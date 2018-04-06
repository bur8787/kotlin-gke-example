package org.jetbrains.kotlin.demo

import org.springframework.stereotype.Repository

@Repository
class WorkerDao: WorkerRepository{
    override fun findAll(): List<Worker> {
        return listOf<Worker>(Worker(1, "aaa"), Worker(2, "bbb"))
    }
}