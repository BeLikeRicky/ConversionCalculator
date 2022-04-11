package com.company;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Use switch case to call different methods for the calculator
        //Then loop the input until it is a valid value
        Menu();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number (1-5): ");

            if (scan.hasNextInt()) {
                switch (scan.nextInt()) {
                    case 1 -> calcCelsius();
                    case 2 -> calcFahrenheit();
                }
            }
    }

    //Separate Menu so that main menu isn't long
    public static void Menu() {
        LocalDate date = LocalDate.now();
        System.out.println("**** WELCOME TO THE CONVERSION CALCULATOR ****");
        System.out.println("**** Current Date: " + date);
        System.out.println("**** Press 1: Calculate Fahrenheit to Celsius");
        System.out.println("**** Press 2: Calculate Celsius to Fahrenheit");

    }

    //Enter a number in Fahrenheit get a number in Celsius
    public static void calcCelsius() {
        Scanner sc =  new Scanner(System.in);
        System.out.println("**** TEMPERATURE CALCULATOR ****");
        System.out.println("Enter a number in Fahrenheit: ");

        //Fix so that loops until correct value for input
        if (!sc.hasNextInt()) {
            System.out.println("Invalid Value");
            System.out.println("Enter a number: ");
        } else {
            int fahrenheit = sc.nextInt();
            int celsius = (fahrenheit - 32) * 5/9;
            System.out.println("Celsius: " + celsius + "°C" + " " + "Fahrenheit: " + fahrenheit + "°F");
            sc.close();
        }
    }

    //Enter a number in Celsius get a number in Fahrenheit
    public static void calcFahrenheit() {
        Scanner sc =  new Scanner(System.in);
        System.out.println("**** TEMPERATURE CALCULATOR ****");
        System.out.println("Enter a number in Celsius: ");

            //Fix so that loops until correct value for input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid Value");
                System.out.println("Enter a number: ");
            } else {
                int celcius = sc.nextInt();
                int fahrenheit = (celcius * 9 / 5) + 32;
                System.out.println("Celsius: " + celcius + "°C" + " " + "Fahrenheit: " + fahrenheit + "°F");
                sc.close();
            }
        }



    }
