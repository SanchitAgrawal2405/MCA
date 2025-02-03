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
public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        System.out.print("Enter fourth number: ");
        int d = scanner.nextInt();
  
        int sum = a + b + c + d;
        int product = a * b * c * d;
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Product of the numbers: " + product);
    }
}
 
    

