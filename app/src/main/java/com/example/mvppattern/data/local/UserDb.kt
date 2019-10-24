package com.example.mvppattern.data.local

import android.content.Context
import android.util.Log
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.mvppattern.base.BaseAsynctask

@Database (entities = arrayOf(User::class), version = 1, exportSchema = false)

abstract class UserDb : RoomDatabase() {
    abstract fun userDao() : UserDao

    companion object{
        private var instance: UserDb?= null
        private var db_name = "user.db"

        fun getDatabase(context: Context) : UserDb? {
            if (instance == null){
                synchronized(UserDb::class.java){
                    if (instance == null){
                        instance = Room.databaseBuilder<UserDb>(context.applicationContext,
                            UserDb::class.java!!, db_name)
                            .allowMainThreadQueries()
                            .addCallback(object : RoomDatabase.Callback(){
                                override fun onCreate(db: SupportSQLiteDatabase) {
                                    super.onCreate(db)
                                    Log.e("UserDb", "populating with data ... ")
                                }
                            }).build()
                    }
                }
            }
            return instance
        }

        class PopulateDbAsync(instance: UserDb) : BaseAsynctask<Void, Void, Void>(){
            private val userDao: UserDao
            init {
                userDao = instance.userDao()
            }

            override fun onBackground(vararg params: Void): Void {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResult(result: Void) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onFailure(result: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }
    }
}