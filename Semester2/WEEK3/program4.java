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
public class program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int number = scanner.nextInt();

        int d1 = number / 1000;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;
        
        System.out.println("The first number is : "+d1);
        System.out.println("The second number is : "+d2);
        System.out.println("The third number is : "+d3);
        System.out.println("The fourth number is : "+d4);
    }
}
    
}
