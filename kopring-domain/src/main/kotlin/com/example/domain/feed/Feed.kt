package com.example.domain.feed

import java.time.LocalDateTime
import java.util.UUID

data class Feed(
    val feedId: UUID,
    val title: String,
    val content: String,
    val createdAt: LocalDateTime,
    val userId: UUID
)
