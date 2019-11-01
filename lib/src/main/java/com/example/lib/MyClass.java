package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("SEC:");
        int num1 = scanner.nextInt();
        int num2 = num1 / 3600;
        int num3 = num1 / 60;
        int num4 = num1 % 60;
        if(num2>=24)
            num2=num2%3600;
        if(num3>=61)
            num3=num3%60;


        System.out.println(+num2 + "hr" + num3 + "min" + num4+ "sec");
    }
}
