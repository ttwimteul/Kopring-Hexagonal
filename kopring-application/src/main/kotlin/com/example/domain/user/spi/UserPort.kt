package com.example.domain.user.spi

import com.example.domain.user.User

interface UserPort {
    fun saveUser(user: User)
}