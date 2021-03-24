package com.alvincodes;

public class Human {
    int fake = 1;
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {

        System.out.println(fake + " is eating");
    }



}
