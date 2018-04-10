package com.example.service

import com.example.domain.Worker
import com.example.repository.WorkerRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
open class WorkerService(private val repository: WorkerRepository) {
    @Transactional
    open fun getWorkers() = repository.findAll()

    @Transactional
    open fun getWorker(id: Int) = repository.findById(id)

    @Transactional
    open fun postWorker(worker: Worker) = repository.create(worker)
}