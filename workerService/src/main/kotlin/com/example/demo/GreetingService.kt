package com.example.demo

import io.grpc.examples.GreeterGrpc
import io.grpc.examples.GreeterOuterClass
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

@GRpcService
class GreeterService : GreeterGrpc.GreeterImplBase() {
    override fun sayHello(request: GreeterOuterClass.HelloRequest, responseObserver: StreamObserver<GreeterOuterClass.HelloReply>) {
        val replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage("Hello " + request.getName())
        responseObserver.onNext(replyBuilder.build())
        responseObserver.onCompleted()
    }
}
