package com.example.rbot.data.repository

import com.example.rbot.data.api.ApiService
import com.example.rbot.data.common.NetworkResult
import com.example.rbot.data.model.PhotosModel
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject
import com.example.rbot.data.common.BaseApiResponse

@ActivityRetainedScoped
class MainRepository @Inject constructor(private val apiService: ApiService, private val defaultDispatcher: CoroutineDispatcher) : BaseApiResponse() {
    suspend fun getPhotos() : NetworkResult<List<PhotosModel>> {
        return withContext(defaultDispatcher){safeApiCall { apiService.getPhotos() }}
    }

}