package com.example.sbb;

import com.example.sbb.article.Article;
import com.example.sbb.article.ArticleRepository;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SbbApplicationTests {
	@Autowired
	private ArticleRepository articleRepository;

	@Test
	void test1() {
		Article article = new Article();
		article.setSubject("제목입니다1.");
		article.setContent("내용입니다1.");
		article.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(article);
	}

}
