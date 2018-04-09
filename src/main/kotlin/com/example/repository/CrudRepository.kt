package com.example.repository

interface CrudRepository<T, K> {
    fun create(m: T): T
    fun findAll(): Iterable<T>
    fun findById(k: K): T
}