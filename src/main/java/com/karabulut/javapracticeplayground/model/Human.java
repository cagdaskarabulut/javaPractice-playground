package com.karabulut.javapracticeplayground.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Human {
    private String name;
    private Integer age;
    private Boolean hasCar;
    private Boolean hasHouse;
}
