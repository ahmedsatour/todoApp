package com.example.toodoapp.data_base

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.toodoapp.data_base.app.dao.TodoDao
import com.example.toodoapp.data_base.app.model.TodoModel

@Database(entities = [TodoModel::class ], version = 1)
abstract class TodoDatabase private constructor(): RoomDatabase() {

    abstract fun getTodoDao() : TodoDao

    companion object{

     private var todoDatabaseInstance : TodoDatabase?=null
      private  val DATABASE_NAME = "todo_database"

        fun getInstance(context :Context) : TodoDatabase {

            if (todoDatabaseInstance == null){
                todoDatabaseInstance = Room.databaseBuilder(
                    context.applicationContext,
                    TodoDatabase::class.java,
                    DATABASE_NAME


                ).fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()

            }
            return todoDatabaseInstance!!
        }

    }

}