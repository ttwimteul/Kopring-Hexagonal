package com.example.persistence.user.mapper

import com.example.domain.user.User

class UserMapper {
    fun toEntity(user:User): com.example.persistence.user.entity.User {
        return com.example.persistence.user.entity.User(
            id = user.userId,
            accountId = user.accountId,
            age = user.age,
            password = user.password
        )
    }
}