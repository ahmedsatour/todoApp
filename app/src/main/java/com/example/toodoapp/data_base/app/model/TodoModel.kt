package com.example.toodoapp.data_base.app.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "todo_table")
class TodoModel(
    @PrimaryKey(autoGenerate = true)
    val id :Int?=null,
    val title:String?=null,
    val description:String?=null,
    val time: Date?=null,
    val isDone:Boolean?=null

    )