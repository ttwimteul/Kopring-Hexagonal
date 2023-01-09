package com.example.domain.user.usecase

import com.example.domain.user.User
import com.example.domain.user.dto.SignupRequest
import com.example.domain.user.spi.UserPort
import com.example.kopring.global.annotation.UseCase
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.UUID


@UseCase
class SignupUseCase(
    private val userPort: UserPort
) {

    fun execute(signupRequest: SignupRequest) {
        val user = User(
            userId = UUID.randomUUID(),
            accountId = signupRequest.accountId,
            password = signupRequest.password,
            age = signupRequest.age
        )

        userPort.saveUser(user)
    }
}