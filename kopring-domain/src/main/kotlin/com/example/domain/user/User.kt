package com.example.domain.user

import java.time.LocalDateTime
import java.util.*

data class User(
    val userId: UUID,
    val accountId: String,
    val age: Int,
    val password: String,
    val cratedAt: LocalDateTime
)
