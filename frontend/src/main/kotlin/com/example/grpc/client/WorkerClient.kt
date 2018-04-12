package com.example.grpc.client

import com.example.domain.Worker
import com.example.generated.grpc.GreeterGrpc
import com.example.generated.grpc.GreeterOuterClass
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import org.springframework.stereotype.Component

@Component
class WorkerClient {
    fun getWorkers(): List<Worker> {
        val channel = getChannel()
        var response: GreeterOuterClass.HelloReply
        try {
            val stub = GreeterGrpc.newBlockingStub(getChannel())
            val request = GreeterOuterClass.HelloRequest.newBuilder().setName("Bob").build()
            response = stub.sayHello(request)
        } finally {
            channel.shutdown()
        }
        return listOf<Worker>(Worker(1, response.message))
    }

    fun getWorker(id: Int) {
        TODO()
    }

    fun postWorker(worker: Worker) {
        TODO()
    }

    private fun getChannel(): ManagedChannel {
        return ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build()
    }
}
