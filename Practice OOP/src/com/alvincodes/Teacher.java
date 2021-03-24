package com.alvincodes;

public class Teacher extends User{
    @Override
    public void speak() {
        super.speak();
        System.out.println("Teacher speak activated...");
    }
}
