package com.example.burger0520.controller;

import com.example.burger0520.dto.BurgerForm;
import com.example.burger0520.repository.BurgerRepository;
import com.example.burger0520.vo.Burger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class BurgerController {

    @Autowired
    private BurgerRepository burgerRepository;


    @GetMapping("/")
    public String index() {
        return "burgers/index";
    }

    @GetMapping("/burgers/new")
    public String newBurger() {
        return "burgers/new";
    }


    @PostMapping("/burgers")
    public String create(BurgerForm form) {
        log.info(form.toString());
        Burger burger = form.toEntity();
        log.info(burger.toString());
        return "redirect:/";
    }
}
