package com.example.toodoapp.data_base.app.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.toodoapp.data_base.app.model.TodoModel

interface TodoDao {
    @Insert
    fun insertTodo(todo: TodoModel)


    @Update
    fun updateTodo(todo: TodoModel)

    @Delete
    fun deleteTodo(todo: TodoModel)

    @Query("SELECT * FROM todo_table ")
    fun getAllTodo() : List<TodoModel>
}