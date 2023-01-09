package com.example.domain.user.dto

import jakarta.validation.constraints.NotNull

data class SignupWebRequest(
    @NotNull
    val accountId: String,
    @NotNull
    val password: String,
    @NotNull
    val age: Int
)
