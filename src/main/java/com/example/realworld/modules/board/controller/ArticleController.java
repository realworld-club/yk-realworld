package com.example.realworld.modules.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class ArticleController {

    // ?tag=AngularJS
    // ?author=jake
    // ?favorited=jake
    // ?limit=20 (default 20)
    // ?offset=0 (default 0)
    @GetMapping("/articles")
    public ResponseEntity<?> listArticles() {
        return null;
    }

    @GetMapping("/articles/feed")
    public ResponseEntity<?> feedArticles() {
        return null;
    }

    @GetMapping("/articles/{slug}")
    public ResponseEntity<?> getArticle() {
        return null;
    }

    @PostMapping("/articles")
    public ResponseEntity<?> createArticle() {
        return null;
    }

    @PostMapping("/articles/{slug}")
    public ResponseEntity<?> updateArticle() {
        return null;
    }

    @DeleteMapping("/articles/{slug}")
    public ResponseEntity<?> deleteArticle() {
        return null;
    }
}
