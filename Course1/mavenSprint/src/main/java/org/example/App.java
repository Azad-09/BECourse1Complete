package org.example;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Calculator cal =new Calculator();
        System.out.println("Enter your Choice");
        int input =scan.nextInt();
        switch (input)
        {
            case 1:
                System.out.println(cal.add(10,20));
                break;
            case 2:
                System.out.println(cal.sub(10,20));
                break;
            case 3:
                System.out.println(cal.multiply(10,20));
                break;
            case 4:
                System.out.println(cal.divide(10,20));
                break;
            case 5:
                System.out.println(cal.module(10,20));

        }
        fibonacci f =new fibonacci();
        f.fibo(2,4);

    }
}

