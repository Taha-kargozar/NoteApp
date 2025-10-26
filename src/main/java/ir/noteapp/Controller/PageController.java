package ir.noteapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page/")
public class PageController {
    @GetMapping
    public String home() {
        return "home";
    }

    @GetMapping("/all")
    public String all() {
        return "all";
    }

    @GetMapping("/add")
    public String add() {
        return "add";
    }
}
