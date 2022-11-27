package com.example.kotlinspringsimpletoy.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.*

@Entity
class Comment (
    userId: Long,
    postId: Long,
    content: String,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
    ){

    var userId: Long = userId
        private set

    var content: String = content
        private set

    var postId: Long = postId
        private set

    val createdAt: LocalDateTime = LocalDateTime.now()

    var modifiedAt: LocalDateTime = LocalDateTime.now()
        private set

    fun update(
        content: String
    ) {
        this.content = content
        this.modifiedAt = LocalDateTime.now()
    }
}