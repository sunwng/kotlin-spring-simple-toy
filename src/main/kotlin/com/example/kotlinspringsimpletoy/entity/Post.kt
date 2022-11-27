package com.example.kotlinspringsimpletoy.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Post (
    userId: Long,
    title: String,
    content: String,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0
) {
    val userId: Long = userId

    var title: String = title
        private set

    var content: String = content
        private set

    val createdAt: LocalDateTime = LocalDateTime.now()

    var modifiedAt: LocalDateTime = LocalDateTime.now()
        private set

    fun update(
        title: String? = null,
        content: String? = null
    ) {
        this.modifiedAt = LocalDateTime.now()
    }
}