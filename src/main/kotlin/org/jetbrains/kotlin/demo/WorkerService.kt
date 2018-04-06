package org.jetbrains.kotlin.demo

import org.springframework.stereotype.Service

@Service
class WorkerService(private val repository: WorkerRepository) {
    fun getWorkers(): List<Worker>{
       return repository.findAll()
    }
}