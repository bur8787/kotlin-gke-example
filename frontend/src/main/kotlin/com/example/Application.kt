package com.example

import org.jetbrains.exposed.spring.SpringTransactionManager
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.transaction.annotation.EnableTransactionManagement
import javax.sql.DataSource

@EnableTransactionManagement
@SpringBootApplication
open class Application {
    @Bean
    open fun transactionManager(dataSource: DataSource) = SpringTransactionManager(dataSource)
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
