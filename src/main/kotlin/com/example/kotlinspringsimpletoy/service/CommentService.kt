package com.example.kotlinspringsimpletoy.service

import com.example.kotlinspringsimpletoy.dto.CreateCommentRequest
import com.example.kotlinspringsimpletoy.dto.CreateCommentResponse
import com.example.kotlinspringsimpletoy.dto.UpdateCommentRequest
import com.example.kotlinspringsimpletoy.dto.UpdateCommentResponse
import com.example.kotlinspringsimpletoy.entity.Comment
import com.example.kotlinspringsimpletoy.repository.CommentRepository
import org.springframework.stereotype.Service

@Service
class CommentService (
    private val commentRepository: CommentRepository
    ){
    fun createComment(form: CreateCommentRequest): CreateCommentResponse {
        val createdComment = commentRepository.save(
            Comment(
                form.userId,
                form.postId,
                form.content
            )
        )
        return CreateCommentResponse(
            createdComment.id,
            createdComment.userId,
            createdComment.postId,
            createdComment.content,
            createdComment.createdAt,
            createdComment.modifiedAt
        )
    }

    fun updateComment(form: UpdateCommentRequest): UpdateCommentResponse {
        val targetComment = commentRepository.findById(form.commentId);
        targetComment.get().update(form.content)
        return UpdateCommentResponse(
            targetComment.get().id,
            targetComment.get().userId,
            targetComment.get().content,
            targetComment.get().modifiedAt
        )
    }

    fun deleteComment(commentId: Long) {
        commentRepository.deleteById(commentId);
    }

}