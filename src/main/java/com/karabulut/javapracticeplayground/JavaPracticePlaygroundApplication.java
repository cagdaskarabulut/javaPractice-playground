package com.karabulut.javapracticeplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class JavaPracticePlaygroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaPracticePlaygroundApplication.class, args);

        System.out.println(average(2,1));
    }

    public static double average(int a, int b) {
        return (a+b)/2;
    }

}
