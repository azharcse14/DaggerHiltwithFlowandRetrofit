package com.example.daggerhiltwithflowandretrofit.model.di

import android.provider.SyncStateContract
import com.example.daggerhiltwithflowandretrofit.model.component.ApplicationComponent
import com.example.daggerhiltwithflowandretrofit.model.network.ApiService
import com.example.daggerhiltwithflowandretrofit.model.utils.Constants.BaseUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(SyncStateContract.Constants.BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun providesApiService(retrofit: Retrofit) : ApiService =
        retrofit.create(ApiService::class.java)
}
