package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class IndexController {
    @PutMapping("/")
    public String index() {
        return "index";
    }

}

