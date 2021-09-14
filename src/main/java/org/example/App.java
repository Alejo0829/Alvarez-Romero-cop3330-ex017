package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double adr;
        System.out.print("Enter a 1 if you are a male or a 2 if you are a female: ");
        int gender = sc.nextInt();
        if(gender == 1) {
           adr = 0.73;
        }
        else {
            adr = 0.66;
        }
        System.out.print("How many ounces of alcohol did you have? ");
        double ounces = sc.nextDouble();
        System.out.print("What is your weight, in pounds? ");
        double pweight = sc.nextDouble();
        System.out.print("How many hours has it been since your last drink? ");
        double hours = sc.nextDouble();

        double BAC = ounces * 5.14/pweight * adr - 0.015 * hours;
        System.out.println("Your BAC is "+BAC);

        if(BAC >= 0.08){
            System.out.println("It is not legal for you to drive.");
        }
        else{
            System.out.println("It is legal for you to drive.");
        }
    }
}
