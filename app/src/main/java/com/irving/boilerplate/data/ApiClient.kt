package com.irving.boilerplate.data

import com.irving.boilerplate.data.model.LoginRequest
import com.irving.boilerplate.data.model.LoginResponse
import com.irving.boilerplate.data.model.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiClient {

    @POST("token/")
    fun login(@Body userData:LoginRequest): Call<LoginResponse>

    @POST("register/")
    fun registerUser(@Body userData:User): Call<User>

}