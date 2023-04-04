package com.karabulut.javapracticeplayground.controller;

import com.karabulut.javapracticeplayground.service.HelloService;
import com.karabulut.javapracticeplayground.model.Human;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {
    private final HelloService service;// when you use "private final", you don't need to use @Autowired

    @RequestMapping("/")
    public String printHello(){
        Human activeHuman = new Human("ronaldo",40,true,true);
        String isRich = service.isRich(activeHuman) ? "rich" : "not rich";
        return "Hello " + activeHuman.getName() + ". You are " + isRich;
    }

}
