package com.example.grpc.client

import com.example.domain.Worker
import com.example.generated.grpc.WorkerGrpc
import com.example.generated.grpc.WorkerOuterClass
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import org.springframework.stereotype.Component

@Component
class WorkerClient {
    fun getWorkers(): List<Worker> {
        val channel = getChannel()
        var response: WorkerOuterClass.WorkersModel
        try {
            val stub = WorkerGrpc.newBlockingStub(getChannel())
            val request = WorkerOuterClass.Empty.newBuilder().build()
            response = stub.getWorkers(request)
        } finally {
            channel.shutdown()
        }
        return response.workerList.map { Worker(it.id, it.name) }
    }

    fun getWorker(id: Int): Worker {
        val channel = getChannel()
        var response: WorkerOuterClass.WorkerModel
        try {
            val stub = WorkerGrpc.newBlockingStub(getChannel())
            val request = WorkerOuterClass.GetWorkerRequest.newBuilder().setId(id).build()
            response = stub.getWorker(request)
        } finally {
            channel.shutdown()
        }
        return Worker(response.id, response.name)
    }

    fun postWorker(worker: Worker): Worker {
        val channel = getChannel()
        var response: WorkerOuterClass.WorkerModel
        try {
            val stub = WorkerGrpc.newBlockingStub(getChannel())
            val request = WorkerOuterClass.WorkerModel.newBuilder().setName(worker.name).build()
            response = stub.postWorker(request)
        } finally {
            channel.shutdown()
        }
        return Worker(response.id, response.name)
    }

    private fun getChannel(): ManagedChannel {
        return ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build()
    }
}
