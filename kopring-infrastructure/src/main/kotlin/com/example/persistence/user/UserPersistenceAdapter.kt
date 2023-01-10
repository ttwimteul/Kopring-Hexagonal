package com.example.persistence.user

import com.example.domain.user.User
import com.example.kopring.domain.user.spi.UserPort
import com.example.persistence.user.entity.repository.UserRepository
import com.example.persistence.user.mapper.UserMapper

class UserPersistenceAdapter(
    private val userRepository: UserRepository,
    private val userMapper: UserMapper
): UserPort {
    override fun saveUser(user: User) {
        userRepository.save(
            userMapper.toEntity(user)
        )
    }

}