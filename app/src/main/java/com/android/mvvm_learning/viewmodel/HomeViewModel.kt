package com.android.mvvm_learning.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.mvvm_learning.model.UserData
import com.android.mvvm_learning.model.UserRepository

class HomeViewModel: ViewModel(){
    val userRepository: UserRepository = UserRepository()

    private val _userData = MutableLiveData<UserData>()
    val userData: MutableLiveData<UserData> = _userData


    fun getUserData(){
        val userResult = userRepository.fetchUserData()
        _userData.postValue(userResult)
    }
}