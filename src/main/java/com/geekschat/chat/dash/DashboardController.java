package com.geekschat.chat.dash;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    
    @GetMapping("/dashboard")
    public String getDash(Model model){
        //TODO: Add data to model
        return "dashboard";
    }
}
