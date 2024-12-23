package com.example.StudentService.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
    @GetMapping("/")
    public String home() {
        return "index"; // This resolves to /WEB-INF/views/index.jsp
    }


}
