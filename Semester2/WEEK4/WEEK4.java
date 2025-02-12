/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

class OddAndEven {
    int countOfOdd;
    int countOfEven;

    public OddAndEven() {
        countOfOdd = 0;
        countOfEven = 0;
    }

    public void addNumber(int number) {
        if (number % 2 != 0) {
            countOfOdd++;
        } else {
            countOfEven++;
        }
    }

    public String toString() {
        return "Number of Odd: " + countOfOdd + ", Number of Even: " + countOfEven;
    }
}
public class WEEK4 {
    public static void main(String[] args) {
        OddAndEven counter = new OddAndEven();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter numbers (enter 'Q' to quit):");
        while (true) {
            input = scanner.next();
            if (input.equals("Q") || input.equals("q")) {
                break;
            }
            boolean isValid = true;
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (i == 0 && ch == '-') {
                    continue; // allow negative numbers
                }
                if (ch < '0' || ch > '9') {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                int number = Integer.parseInt(input);
                counter.addNumber(number);
            } else {
                System.out.println("Invalid input. Please enter an integer or 'Q' to quit.");
            }
        }
        System.out.println(counter);
        scanner.close();
    }
}
        // TODO code application logic here
    
    

