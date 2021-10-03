package com.irving.boilerplate.data.database

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    //Creando BD
    @Provides
    @Singleton
    fun ProvideDatabase(@ApplicationContext context: Context): DataBase{
        return Room.databaseBuilder(context, DataBase::class.java, DataBase.dbName).build()
    }

    //Creando DAO
    @Provides
    @Singleton
    fun provideUserDao(dataBase: DataBase): UserDAO{
        return dataBase.userDao()
    }
}