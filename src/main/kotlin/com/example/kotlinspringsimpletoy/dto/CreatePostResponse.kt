package com.example.kotlinspringsimpletoy.dto

import java.time.LocalDateTime

data class CreatePostResponse(
    var postId: Long,
    var userId: Long,
    var title: String,
    var content: String,
    var createdAt: LocalDateTime,
    var modifiedAt: LocalDateTime
) {
}