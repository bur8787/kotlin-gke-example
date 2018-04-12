package com.example.web

import com.example.domain.Worker
import com.example.grpc.client.WorkerClient
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RequestBody
import java.util.concurrent.atomic.AtomicInteger

@RestController
class WorkerController(private val client: WorkerClient) {

    @GetMapping("/workers")
    fun getWorkers() = client.getWorkers()

    @GetMapping("/workers/{id}")
    fun getWorker(@PathVariable id: Int) = client.getWorker(id)

    @PostMapping("/workers")
    @ResponseStatus(HttpStatus.CREATED)
    fun postWorkers(@RequestBody worker: Worker) = client.postWorker(worker)

    @GetMapping("/private/workers")
    fun getWorkersWithAuthenticated() = client.getWorkers()
}