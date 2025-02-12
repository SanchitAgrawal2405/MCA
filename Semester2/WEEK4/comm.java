/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author CSD
 */

class Commission {
    private double sale;
    public Commission(double sale) {
        this.sale = sale;
    }
    public double commission() {
        if (sale < 500) {
            return sale * 0.02;  // 2% commission
        } else if (sale >= 500 && sale <= 5000) {
            return sale * 0.05;  // 5% commission
        } else {
            return sale * 0.08;  // 8% commission
        }
    }
}
public class comm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sales amount: ");
        String input = scanner.nextLine();
        boolean isValid = true;
        double sale = 0;
 
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!(Character.isDigit(ch) || (ch == '.' && i > 0 && i < input.length() - 1) || (ch == '-' && i == 0))) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            sale = Double.parseDouble(input);
        } else {
            System.out.println("Invalid Input");
            return; 
        }
        if (sale < 0) {
            System.out.println("Invalid Input");
        } else {
            // Create a Commission object and calculate commission
            Commission commissionObj = new Commission(sale);
            double commissionAmount = commissionObj.commission();
            System.out.println("Commission: " + commissionAmount);
        }
    }
}

