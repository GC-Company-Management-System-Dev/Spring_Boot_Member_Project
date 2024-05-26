package com.codingrecipe.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 기본 페이지 요청하는 메서드 구현
    // Line 10에서 호출이 오면 Line 11의 내용이 브라우저에 띄워진다
    @GetMapping("/")
    public String index() {
        return "index";
    } // templates 폴더의 index.html 을 찾아가는 코드
}
