package com.home;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public void helloMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello. I'm an calculator.\nGive me firts number: ");
        int a = scanner.nextInt();
        System.out.print("Give me secound number: ");
        int b = scanner.nextInt();
        chooseMetod(a, b);
    }
    public void chooseMetod(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What action would you like to do? [plus/minus/multiple/divide]: ");
        String choose = scanner.nextLine();
        switch (choose) {
            case "plus":
                System.out.println(plus(a,b));
                break;
            case "minus":
                System.out.println(minus(a,b));
                break;
            case "multiple":
                System.out.println(multiple(a,b));
                break;
            case "divide":
                System.out.println(divide(a,b));
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
    public int plus(int y, int z) {
        return y + z;
    }
    public int minus(int p, int q) {
        return p - q;
    }
    public int multiple(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
       if (b == 0) {
           return 0;
       } else {
           return a / b;
       }
    }
}