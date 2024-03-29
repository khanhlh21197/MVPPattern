package com.example.mvppattern.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")

data class User(@PrimaryKey(autoGenerate = true) var id:Int = 0,
                var username: String,
                var email: String,
                var password: String)
