package com.example.tave.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.entity.profile.UserProfileEntity
import com.example.domain.usecases.profile.GetUserProfileUseCase
import com.example.tave.TaveApplication
import com.example.tave.di.qualifier.IoDispatcher
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val profileUseCase: GetUserProfileUseCase,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher
): ViewModel() {
    private val _userProfile = MutableLiveData<UserProfileEntity>()
    val userProfile: LiveData<UserProfileEntity> get() = _userProfile

    private val accessToken: String =
        TaveApplication.authPrefs.getTokenValue("accessToken", "")

    init { loadUserProfile() }

    private fun loadUserProfile(): Job = viewModelScope.launch(ioDispatcher) {
        profileUseCase(accessToken).collect { _userProfile.postValue(it) }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }
}