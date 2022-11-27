package com.example.kotlinspringsimpletoy.service

import com.example.kotlinspringsimpletoy.dto.CreatePostRequest
import com.example.kotlinspringsimpletoy.dto.UpdatePostRequest
import com.example.kotlinspringsimpletoy.entity.Post
import com.example.kotlinspringsimpletoy.repository.PostRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class PostService(
    private val postRepository: PostRepository
) {
    @Transactional
    fun createPost(form: CreatePostRequest): Post {
        return postRepository.save(
            Post(
                userId = form.userId,
                title = form.title,
                content = form.content
            )
        )
    }

//    @Transactional
//    fun updatePost(form: UpdatePostRequest): Post {
//        return postRepository.save(
//            Post(
//                userId = form.userId,
//                title = form.title,
//                content = form.content
//            )
//        )
//    }
    fun deletePost(postId: Long) {
        postRepository.deleteById(postId)
    }
}