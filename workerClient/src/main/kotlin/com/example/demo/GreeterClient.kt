package com.example.demo

import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.StatusRuntimeException
import io.grpc.examples.GreeterGrpc
import io.grpc.examples.GreeterOuterClass.HelloReply
import io.grpc.examples.GreeterOuterClass.HelloRequest
import java.util.concurrent.TimeUnit
import java.util.logging.Level
import java.util.logging.Logger

class GreeterClient(private val channel: ManagedChannel, private val blockingStub: GreeterGrpc.GreeterBlockingStub) {

    companion object {
        private val logger = Logger.getLogger(GreeterClient::class.java.getName())

        @JvmStatic
        fun main(args: Array<String>) {
            val client = GreeterClient("localhost", 6565)
            try {
                /* Access a service running on the local machine on port 50051 */
                var user = "world"
                if (args.size > 0) {
                    user = args[0] /* Use the arg as the name to greet if provided */
                }
                client.greet(user)
            } finally {
                client.shutdown()
            }
        }
    }

    constructor(host: String, port: Int) : this(ManagedChannelBuilder.forAddress(host, port).usePlaintext().build())

    constructor(channel: ManagedChannel) : this(channel, GreeterGrpc.newBlockingStub(channel))

    fun greet(name: String) {
        logger.info("Will try to greet $name ...")
        val request = HelloRequest.newBuilder().setName(name).build()
        val response: HelloReply
        try {
            response = blockingStub.sayHello(request)
        } catch (e: StatusRuntimeException) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.status)
            return
        }
        logger.info("Greeting: " + response.message)
    }

    @Throws(InterruptedException::class)
    fun shutdown() {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS)
    }

}