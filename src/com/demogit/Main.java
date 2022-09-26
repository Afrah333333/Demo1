package com.demogit;

public class Main {

    public static void main(String[] args) {
	int celsius, fahrenheit;
    fahrenheit = 59;
    celsius = (fahrenheit - 32) * 5/9;
        System.out.println(celsius);
        //conveting to fahrenheit from celsius
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit);
    }
}
