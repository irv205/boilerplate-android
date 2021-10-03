package com.irving.boilerplate.di

import android.content.Context
import com.irving.boilerplate.R
import com.irving.boilerplate.data.ApiClient
import com.irving.boilerplate.data.network.AppProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    //Creando cliente de retrofit
    @Singleton
    @Provides
    fun getApi(@ApplicationContext context: Context): AppProvider {
        return AppProvider(context.getString(R.string.base_url))
    }

    //Obteniendo la interface
    @Singleton
    @Provides
    fun providesInterface(appProvider: AppProvider):ApiClient {
        return appProvider.getEndpoint(ApiClient::class.java)
    }

}