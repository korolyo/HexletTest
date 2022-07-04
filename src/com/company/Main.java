package com.company;

import java.util.Scanner;

public class Main {


    public static void fizzBuzz(int result) {
        if (result % 15 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (result % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (result % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to my FizzBuzz!\nEnter any number and get an anwer!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String str = scanner.nextLine();
                if (str.equals("q")) {
                    return ;
                }
                int result = Integer.parseInt(str);
                fizzBuzz(result);
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Try again (enter any single number)\nEnter 'q' if you want to finish");
            }
        }
    }
}
