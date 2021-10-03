package com.irving.boilerplate.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.irving.boilerplate.data.model.User

@Database(
    entities = [User::class],
    version = 1,
    exportSchema = false
)
abstract class DataBase: RoomDatabase() {

    companion object{
        const val dbName = "boilerplate_database.db"
        const val tableUsers = "user"
    }

    abstract fun userDao():UserDAO

}