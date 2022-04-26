package com.helloworld;

import java.lang.module.FindException;
import java.util.function.DoubleToIntFunction;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        String name = "John";
        System.out.println(name);

        int myNum = 24;
        System.out.println(myNum);

        String firstname = "Aaron";
        String lastname = "Lynn";
        String fullname = firstname + lastname;
        System.out.println(fullname);

        String myName = "Aaron";
                System.out.println("Hello, " + myName + "!");

        int x = 69, y = 69, z = 69;
        System.out.println(x+y+z);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        double mDouble = 9.8764d;
        int mInt = (int)mDouble;
        System.out.println(mDouble);
        System.out.println(mInt);

        String txt = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("The lenght of the txt string is: " + txt.length()) ;

        String text ="Let's have sex";
        System.out.println(text.indexOf("sex"));

        String fname = "Andrew ";
        String lname = "Lynn";
        System.out.println(fname.concat(lname));

        String a = "6";
        int b = 9;
        String c = a + b;
        System.out.println(z);

        String vik = "We love \"money\" , right";
        System.out.println(vik);

        int randomNum = (int)(Math.random()*201);
        int sqrt = (int)(Math.sqrt(64));

        System.out.println(Math.abs(-69.69));
        System.out.println(Math.max(6,9));
        System.out.println(Math.min(6,9));
        System.out.println(sqrt);
        System.out.println(randomNum);

        int time = 20;
        if (time<18){
            System.out.println("Good Morning");
        } else if (time<19) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        int age = 18;
        String myAge = (age>20) ? "Good Morning" : "Good Evening";
        System.out.println(myAge);

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
        }

        String month = "January";
        switch (month){
            case "November":
                System.out.println("My birth month");
                break;
            case "December":
                System.out.println("Last month");
                break;
            case "January":
                System.out.println("First month");
                break;
            default:
                System.out.println("Not a valid month");
        }

        int i = 1;
        while (i <= 5){
            System.out.println("Hello " + i);
            i++;
        }

        int p = 6;
        do {
            System.out.println("Hello " + p);
            p++;
        }
        while (p <= 8);

        for (int f = 0; f < 10; f = f +3){
            System.out.println(f);
        }


    }
}
