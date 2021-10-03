package com.irving.boilerplate.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.irving.boilerplate.data.database.DataBase

@Entity(tableName = DataBase.tableUsers)
class User(
    @SerializedName("id")
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,
    @SerializedName("full_name")
    @ColumnInfo(name = "full_name")
    val full_name:String,
    @SerializedName("email")
    @ColumnInfo(name = "email")
    val email:String,
    @SerializedName("type")
    @ColumnInfo(name = "type")
    val type:Int
)