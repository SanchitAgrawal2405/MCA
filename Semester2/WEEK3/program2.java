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
public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first digit (0-9): ");
        int a = scanner.nextInt();
        System.out.print("Enter second digit (0-9): ");
        int b = scanner.nextInt();
        System.out.print("Enter third digit (0-9): ");
        int c = scanner.nextInt();
        int[] digits = {a, b, c};
        
        // Print all possible combinations using for loop
        System.out.println("All possible combinations are:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == i) continue;
                for (int k = 0; k < 3; k++) {
                    if (k == i || k == j) continue;
                    System.out.println(digits[i] + "" + digits[j] + "" + digits[k]);
                }
            }
        }
    }
}

