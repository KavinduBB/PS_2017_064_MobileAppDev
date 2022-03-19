package com.example.apidemo

import retrofit2.Call
import retrofit2.http.GET

interface APIDemo {

    @get:GET("posts")
    val posts : Call<List<PostModel?>?>?

    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com"
    }

}