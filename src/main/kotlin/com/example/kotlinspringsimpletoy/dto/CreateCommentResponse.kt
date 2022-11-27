package com.example.kotlinspringsimpletoy.dto

import java.time.LocalDateTime

data class CreateCommentResponse(
    var commentId: Long,
    var userId: Long,
    var postId: Long,
    var content: String,
    var createdAt: LocalDateTime,
    var modifiedAt: LocalDateTime
) {
}