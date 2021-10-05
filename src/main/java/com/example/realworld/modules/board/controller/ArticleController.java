package com.example.realworld.modules.board.controller;

import com.example.realworld.modules.board.controller.request.NewArticleRequest;
import com.example.realworld.modules.board.service.ArticleService;
import com.example.realworld.modules.user.vo.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/articles/feed")
    public ResponseEntity<?> feedArticles(@AuthenticationPrincipal User user) {
        return null;
    }

    // https://mangkyu.tistory.com/72
    // vs @ModelAttribute
    @GetMapping("/articles")
    public ResponseEntity<?> listArticles(@RequestParam(name = "tag", required = false) String tag,
                                          @RequestParam(name = "author", required = false) String author,
                                          @RequestParam(name = "favorited", required = false) String favorited,
                                          @RequestParam(name = "limit", required = false, defaultValue = "20") Integer limit,
                                          @RequestParam(name = "offset", required = false, defaultValue = "0") Integer offset) {
        return null;
    }

    @PostMapping("/articles")
    public ResponseEntity<?> createArticle(@AuthenticationPrincipal User user,
                                           @RequestBody @Valid NewArticleRequest newArticleRequest) {
        return null;
    }

    @GetMapping("/articles/{slug}")
    public ResponseEntity<?> getArticle() {
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
