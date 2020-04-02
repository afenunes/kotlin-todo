package com.afen.kotlintodo.controller

import com.afen.kotlintodo.model.Todo
import com.afen.kotlintodo.repository.TodoRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/todo")
class TodoController (val repository: TodoRepository) {

    @GetMapping("/")
    fun getNotDone() = repository.findAllByDoneFalse()

    @GetMapping("/all")
    fun getAll() = repository.findAll()

    @PostMapping("/create")
    fun createTodo(@RequestBody todo: Todo) {
        repository.save(todo)
    }
}