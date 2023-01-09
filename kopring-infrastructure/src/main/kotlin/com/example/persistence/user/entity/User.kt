package com.example.persistence.user.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
class User(
    @Id
    @Column(name = "user_id")
    val id: UUID,

    val accountId: String,

    val password: String,

    val age: Int
)