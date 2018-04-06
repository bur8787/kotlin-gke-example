package org.jetbrains.kotlin.demo

interface WorkerRepository {
    fun findAll(): List<Worker>
}