/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaweek3;

/**
 *
 * @author CSD
 */

import java.util.Scanner;

public class program6  {
    public static void generateCombinations(int[] digits, boolean[] used, String current, int length) {
        if (current.length() == length) {
            System.out.println(current);
            return;
        }
        for (int i = 0; i < digits.length; i++) {
            if (!used[i]) { 
                used[i] = true;
                generateCombinations(digits, used, current + digits[i], length);
                used[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of digits we want : ");
        int n=scanner.nextInt();
        int[] digits = new int[n];
        System.out.println("Enter " +n +" distinct digits (0-9):");
        for (int i = 0; i < n; i++) {
            digits[i] = scanner.nextInt();
        }
        boolean[] used = new boolean[n];
        System.out.println("All possible combinations:");
        generateCombinations(digits, used, "", n);
        scanner.close();
    }
}
    

