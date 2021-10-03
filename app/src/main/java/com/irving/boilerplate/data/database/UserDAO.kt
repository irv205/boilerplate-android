package com.irving.boilerplate.data.database
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.irving.boilerplate.data.model.User

@Dao
interface UserDAO {

    //Querys
    @Query("SELECT * FROM user WHERE id= :id")
    fun getUserById(id: String): List<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveUser(user: User): Long
}