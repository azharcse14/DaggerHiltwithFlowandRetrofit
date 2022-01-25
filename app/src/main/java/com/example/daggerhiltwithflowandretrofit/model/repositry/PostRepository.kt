package com.example.daggerhiltwithflowandretrofit.model.repositry

import com.example.daggerhiltwithflowandretrofit.model.data.Post
import com.example.daggerhiltwithflowandretrofit.model.network.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PostRepository @Inject constructor(private val apiService: ApiService) {

    fun getPost() : Flow<List<Post>> = flow {
        val response= apiService.getPosts()
        emit(response)
    }.flowOn(Dispatchers.IO)
}