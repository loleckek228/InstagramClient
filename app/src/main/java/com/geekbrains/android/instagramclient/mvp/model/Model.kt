package com.geekbrains.android.instagramclient.mvp.model

import com.geekbrains.android.instagramclient.mvp.model.entity.User

class Model {
    fun setUserName(name: String) {
        User.name = name
    }

    fun getUser(): User {
        return User
    }
}