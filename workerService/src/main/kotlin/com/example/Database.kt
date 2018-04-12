package com.example

import org.jetbrains.exposed.sql.Table

object Workers : Table() {
    val id = integer("id").autoIncrement().primaryKey()
    val name = varchar("name", 50)
}
