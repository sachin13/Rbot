package com.example.rbot.viewmodel

import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rbot.data.common.NetworkResult
import com.example.rbot.data.model.PhotosModel
import com.example.rbot.data.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class PhotosViewModel @Inject constructor(
    private val mainRepository: MainRepository
) : ViewModel(), LifecycleObserver {

    init {
        getPhotos()
    }

    val snapshotStateList = SnapshotStateList<PhotosModel>()

    private fun getPhotos() = viewModelScope.launch {
        when (val result = mainRepository.getPhotos()) {
            is NetworkResult.Success -> {
                result.data?.let { snapshotStateList.addAll(it) }
            }
            else -> {

            }
        }


    }


}