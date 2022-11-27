package com.example.kotlinspringsimpletoy.dto

import javax.validation.constraints.NotBlank

data class CreateCommentRequest(
    @field: NotBlank
    var content: String,

    @field: NotBlank
    var userId: Long,

    @field: NotBlank
    var postId: Long
) {
}