package com.irving.boilerplate.data.model

import com.google.gson.annotations.SerializedName

class LoginResponse(
    @SerializedName("refresh")
    val refresh:String,
    @SerializedName("access")
    val access:String
)