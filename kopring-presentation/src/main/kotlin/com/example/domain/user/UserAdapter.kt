package com.example.domain.user

import com.example.kopring.domain.user.dto.SignupRequest
import com.example.domain.user.dto.SignupWebRequest
import com.example.kopring.domain.user.usecase.SignupUseCase
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserAdapter(
    private val signupUseCase: SignupUseCase
) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/singup")
    fun signup(request: SignupWebRequest) {
        val domainRequest = SignupRequest(
            accountId = request.accountId,
            password = request.password,
            age = request.age
        )

        signupUseCase.execute(domainRequest)
    }
}