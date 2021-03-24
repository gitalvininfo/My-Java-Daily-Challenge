package com.alvincodes;

public class Student extends User{

    @Override
    public void speak() {
        super.speak();
        System.out.println("Student speak activated also...");
    }
}
