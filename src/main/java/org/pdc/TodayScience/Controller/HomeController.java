package org.pdc.TodayScience.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{
    @GetMapping("api/home")
    public String home(Model model) {
        return "./View/home";
    }
}
