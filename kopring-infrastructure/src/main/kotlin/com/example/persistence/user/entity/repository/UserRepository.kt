package com.example.persistence.user.entity.repository

import com.example.persistence.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserRepository: JpaRepository<User, UUID> {
}