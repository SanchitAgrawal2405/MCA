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
public class circle {
    private double radius;
    private double x;
    private double y;

    public circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

   
    public double area() {
        return Math.PI * radius * radius;
    }

   
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

   
    public boolean isPointInside(double px, double py) {
        double distanceSquared = (px - x) * (px - x) + (py - y) * (py - y);
        return distanceSquared <= radius * radius;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the radius of the circle (negative to exit): ");
            double radius = scanner.nextDouble();

            if (radius < 0) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.print("Enter the x-coordinate of the center: ");
            double x = scanner.nextDouble();

            System.out.print("Enter the y-coordinate of the center: ");
            double y = scanner.nextDouble();

            circle circle = new circle(radius, x, y);

            System.out.printf("Area of the circle: %.2f%n", circle.area());
            System.out.printf("Perimeter of the circle: %.2f%n", circle.perimeter());

            System.out.print("Enter the x-coordinate of the point to check: ");
            double px = scanner.nextDouble();

            System.out.print("Enter the y-coordinate of the point to check: ");
            double py = scanner.nextDouble();

            if (circle.isPointInside(px, py)) {
                System.out.printf("The point (%.2f, %.2f) is inside the circle.%n", px, py);
            } else {
                System.out.printf("The point (%.2f, %.2f) is outside the circle.%n", px, py);
            }
        }

        scanner.close();
    }
}

    

