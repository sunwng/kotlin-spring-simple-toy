package com.example.kotlinspringsimpletoy.dto

import java.time.LocalDateTime

data class UpdateCommentResponse(
    var commentId: Long,
    var userId: Long,
    var content: String,
    var modifiedAt: LocalDateTime
) {
}