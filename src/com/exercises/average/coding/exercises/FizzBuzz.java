package com.exercises.average.coding.exercises;

import java.util.Scanner;


//write a method that returns 'Fizz' for multiples of 3 and 'Buzz' for the multiples of 5.
//For numbers which are multiples of both 3 and 5 return 'FizzBuzz'.
// For numbers that are neither, return the input number again.
//To end the process input a -1;
public class FizzBuzz {
    static String FizzBuzz(Integer input) {
        String result = " ";
        if (input % 3 == 0) {
            result += "Fizz";
        }
        if (input % 5 == 0) {
            result += "Buzz";
        }
        if (result.equals("")) {
            result = input.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter a number: ");
            Scanner s = new Scanner(System.in);
            int input = s.nextInt();
            if(input==-1)
                break;
            FizzBuzz(input);
            System.out.println(FizzBuzz(input));
        }
    }
}
