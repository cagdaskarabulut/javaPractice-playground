package com.karabulut.javapracticeplayground.service.impl;

import com.karabulut.javapracticeplayground.model.Human;
import com.karabulut.javapracticeplayground.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public boolean isRich(Human human) {
        if (human.getHasCar() && human.getHasHouse()){
            return true;
        } else {
            return false;
        }
    }
}
