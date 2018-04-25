package com.example.service

import com.example.domain.Worker
import com.example.generated.grpc.WorkerGrpc
import com.example.generated.grpc.WorkerOuterClass
import com.example.repository.WorkerRepository
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

@GRpcService
open class WorkerService(private val repository: WorkerRepository) : WorkerGrpc.WorkerImplBase() {

    override fun getWorkers(request: WorkerOuterClass.Empty, responseObserver: StreamObserver<WorkerOuterClass.WorkersModel>) {
        var replyBuilder = WorkerOuterClass.WorkersModel.newBuilder()
        repository.findAll().forEach {
            replyBuilder.addWorker(WorkerOuterClass.WorkerModel.newBuilder().setId(it.id!!).setName(it.name))
        }

        responseObserver.onNext(replyBuilder.build())
        responseObserver.onCompleted()
    }

    override fun getWorker(request: WorkerOuterClass.GetWorkerRequest, responseObserver: StreamObserver<WorkerOuterClass.WorkerModel>) {
        val worker = repository.findById(request.id)
        var replyBuilder = WorkerOuterClass.WorkerModel.newBuilder()
        replyBuilder.setId(worker.id!!).setName(worker.name)
        responseObserver.onNext(replyBuilder.build())
        responseObserver.onCompleted()
    }

    override fun postWorker(request: WorkerOuterClass.PostWorkerRequest, responseObserver: StreamObserver<WorkerOuterClass.WorkerModel>) {
        val worker = repository.create(Worker(null, request.worker.name))
        var replyBuilder = WorkerOuterClass.WorkerModel.newBuilder()
        replyBuilder.setId(worker.id!!).setName(worker.name)
        responseObserver.onNext(replyBuilder.build())
        responseObserver.onCompleted()
    }
}
