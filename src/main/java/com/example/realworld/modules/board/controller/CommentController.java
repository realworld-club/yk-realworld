package com.example.realworld.modules.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class CommentController {

    @PostMapping("/api/articles/{slug}/comments")
    public ResponseEntity<?> addCommentsToAnArticle() {
        return null;
    }

    @GetMapping("/api/articles/{slug}/comments")
    public ResponseEntity<?> getCommentsFromAnArticle() {
        return null;
    }

    @DeleteMapping("/api/articles/{slug}/comments/{id}")
    public ResponseEntity<?> deleteComment() {
        return null;
    }

    @PostMapping("/api/articles/{slug}/favorite")
    public ResponseEntity<?> favoriteArticle() {
        return null;
    }

    @DeleteMapping("/api/articles/{slug}/favorite")
    public ResponseEntity<?> unfavoriteArticle() {
        return null;
    }
}
