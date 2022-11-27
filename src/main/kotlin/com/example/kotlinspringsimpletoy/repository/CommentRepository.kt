package com.example.kotlinspringsimpletoy.repository

import com.example.kotlinspringsimpletoy.entity.Comment
import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository : JpaRepository<Comment, Long> {}