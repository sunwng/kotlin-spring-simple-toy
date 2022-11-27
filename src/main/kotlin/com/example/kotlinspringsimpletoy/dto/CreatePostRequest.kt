package com.example.kotlinspringsimpletoy.dto

import javax.validation.constraints.NotBlank

data class CreatePostRequest(
    @field: NotBlank
    var title: String,

    @field: NotBlank
    var content: String,

    @field: NotBlank
    var userId: Long
) {
}