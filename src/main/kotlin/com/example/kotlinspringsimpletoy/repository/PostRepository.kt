package com.example.kotlinspringsimpletoy.repository

import com.example.kotlinspringsimpletoy.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long> {}