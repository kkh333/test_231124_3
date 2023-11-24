package com.example.sbb.article;

import lombok.RequiredArgsConstructor;
import org.checkerframework.checker.units.qual.A;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/article")
@Controller
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("/list")
    public String list (Model model) {
        List<Article> articleList = this.articleService.getArticleList();
        model.addAttribute("articleList", articleList);
        return "article_list";
    }

    @GetMapping("/create")
    public String articleCreate () {
        return "article_form";
    }

    @PostMapping("/create")
    public String articleCreate (@RequestParam(value = "subject") String subject, @RequestParam(value = "subject") String content) {
        this.articleService.create(subject, content);
        return "redirect:/article/list";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        Article article = this.articleService.getArticle(id);
        model.addAttribute("article", article);
        return "article_detail";
    }
}
