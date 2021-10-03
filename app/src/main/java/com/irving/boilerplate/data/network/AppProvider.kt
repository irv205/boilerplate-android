package com.irving.boilerplate.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class AppProvider(url: String) {

    private lateinit var retrofit : Retrofit

    init {
        retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    //Esta clase podra recibir una clase de cualquier tipo
    //Retorna siempre la misma clase que recibe
    fun <T> getEndpoint(service_class:Class<T>):T{
        return retrofit.create(service_class)
    }
}