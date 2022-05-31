package com.example.rbot.data.api

import com.example.rbot.data.model.PhotosModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/photos")
    suspend fun getPhotos(): Response<List<PhotosModel>>

}