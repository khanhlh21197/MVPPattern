package com.example.mvppattern.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao interface UserDao{
    @Query("SELECT * FROM USER")
    fun getAllUsers() : List<User>

    @Insert(onConflict = REPLACE)
    fun insert(user: User)
}