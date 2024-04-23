package com.comment.controller;

import com.comment.entity.Comment;
import com.comment.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/comments")
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    // Add a new comment
    @PostMapping("/save")
    public Comment addComment(@RequestBody Comment comment) {
        return commentRepository.save(comment);
    }

    // Retrieve all comments sorted by date of comment
    @GetMapping("/all")
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    // Retrieve comments by username
    @GetMapping("/search/{username}")
    public List<Comment> getCommentsByUsername(@PathVariable String username) {
        return commentRepository.findByUsername(username);
    }


    @GetMapping("/search/date/{date}")
    public List<Comment> getCommentsByDateOfComment(@PathVariable String date) {
        return commentRepository.findByDateOfComment(date);
    }


}
