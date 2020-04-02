package com.afen.kotlintodo.repository

import com.afen.kotlintodo.model.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository : JpaRepository<Todo,Int> {
    fun findAllByDoneFalse(): List<Todo>
}