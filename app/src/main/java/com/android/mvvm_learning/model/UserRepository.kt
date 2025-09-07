package com.android.mvvm_learning.model

class UserRepository {
    fun fetchUserData(): UserData{
        return UserData("John",25)
    }
}