package com.codegym.controller;

import com.codegym.model.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailBoxController {
    @GetMapping("home")
    public String home(Model model){
        String[] language={"English","Vietnamese","Japanese","Chinese"};
        String[] size={"5","15","20","25","25","50","100"};

        model.addAttribute("setting",new Setting());
        model.addAttribute("language",language);
        model.addAttribute("size",size);
        return "home";
    }

    @GetMapping("save")
    public String save(@ModelAttribute Setting setting, Model model){
        String[] language={"English","Vietnamese","Japanese","Chinese"};
        String[] size={"5","15","20","25","25","50","100"};
        model.addAttribute("setting",setting);
        model.addAttribute("language",language);
        model.addAttribute("size",size);
        return "home";
    }

}
