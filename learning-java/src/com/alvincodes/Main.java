package com.alvincodes;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("[1] - Apple Php 49.45");
        System.out.println("[2] - Oranges Php 37.75");
        System.out.println("[3] - Banana Php 75.00");


        System.out.println("Enter your choice: ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();


        System.out.println("Enter payment: ");
        double payment = scan.nextInt();
        double total = 0.00;

        if(choice == 1) {
            total = 49.45;
        }   else if (choice == 2) {
            total = 37.75;
        }   else if (choice == 3) {
            total = 75.00;
        }

        System.out.println(payment);
        System.out.println(total);



        if(payment > total) {
            System.out.println("Payment is enough");
        }   else {
            System.out.println("Payment insufficient. Try again");
            scan.nextInt();
        }



//        Hero hero1 = new Hero("Batman", 42, "$$$");
//        Hero hero2 = new Hero("Superman", 43, "everything");
//
//
//        System.out.println(hero2);






//inheritance
//        Car car = new Car();
//        Bicycle bike = new Bicycle();
//
//        System.out.println(car.doors);
//        System.out.println(bike.pedals);





// pass object to method of other class ezpz;
//        Garage garage = new Garage();
//
//        Car car1 = new Car("BMW");
//        Car car2 = new Car("Tesla");
//
//        garage.park(car1);
//        garage.park(car2);











//        // size of array;
////        Food[] refrigerator = new Food[3];
//
//        // create new object with type Food
//        Food food1 = new Food("pizza");
//        Food food2 = new Food("jamburger");
//        Food food3 = new Food("jatdog");
//
//        // dynamic create array
//        Food[] refrigerator = {food1, food2, food3};
//
//
////        refrigerator[0] = food1;
////        refrigerator[1] = food2;
////        refrigerator[2] = food3;
//
//
//        System.out.println(refrigerator[0].name);
//        System.out.println(refrigerator[1].name);
//        System.out.println(refrigerator[2].name);

    }

}
