package com.hoptojob.server.controller;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SeController implements ErrorController {
    @RequestMapping("/error")
    public String handleError() {
        // Quản lý lỗi và trả về trang tùy chỉnh
        return "error"; // Trang lỗi có thể là một file error.html trong thư mục templates
    }

    public String getErrorPath() {
        return "/error";
    }
}


