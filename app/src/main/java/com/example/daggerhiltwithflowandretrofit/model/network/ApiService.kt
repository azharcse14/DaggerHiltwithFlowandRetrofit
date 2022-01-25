package com.example.daggerhiltwithflowandretrofit.model.network

import com.example.daggerhiltwithflowandretrofit.model.data.Post
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPosts() : List<Post>
}