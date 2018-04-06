package org.jetbrains.kotlin.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class WorkerController(private val service: WorkerService) {

    val counter = AtomicLong()

    @GetMapping("/workers")
    fun publicGreeting(): List<Worker> {
        return service.getWorkers()
    }

    @GetMapping("/private/workers")
    fun privateGreeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Worker(counter.incrementAndGet(), "Hello, $name")
}