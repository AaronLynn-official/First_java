package com.helloworld;

import java.lang.module.FindException;

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
    }
}
