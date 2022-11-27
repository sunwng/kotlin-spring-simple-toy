package com.example.kotlinspringsimpletoy.dto

import javax.validation.constraints.NotBlank

data class UpdateCommentRequest(
    @field: NotBlank
    var commentId: Long,

    @field: NotBlank
    var content: String
) {
}