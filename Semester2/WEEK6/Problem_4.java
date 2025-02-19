package week_6;

import java.util.Scanner;

// Interface defining common shape behavior
interface Drawable {
    double calculateArea();
    double calculatePerimeter();
}

// Base class for common attributes
abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

// Circle class implementing Drawable
class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class implementing Drawable
class Rectangle extends Shape implements Drawable {
    private double length, width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Triangle class implementing Drawable
class Triangle extends Shape implements Drawable {
    private double sideA, sideB, sideC;

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Heron's formula
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

// Main class for user input and testing
public class Problem_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a shape (circle, rectangle, triangle): ");
        String shapeType = scanner.next().toLowerCase();

        switch (shapeType) {
            case "circle":
                System.out.print("Enter color: ");
                String circleColor = scanner.next();
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(circleColor, radius);
                displayResults(circle);
                break;

            case "rectangle":
                System.out.print("Enter color: ");
                String rectangleColor = scanner.next();
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(rectangleColor, length, width);
                displayResults(rectangle);
                break;

            case "triangle":
                System.out.print("Enter color: ");
                String triangleColor = scanner.next();
                System.out.print("Enter side A: ");
                double sideA = scanner.nextDouble();
                System.out.print("Enter side B: ");
                double sideB = scanner.nextDouble();
                System.out.print("Enter side C: ");
                double sideC = scanner.nextDouble();
                Triangle triangle = new Triangle(triangleColor, sideA, sideB, sideC);
                displayResults(triangle);
                break;

            default:
                System.out.println("Invalid shape type!");
        }

        scanner.close();
    }

    // Method to display area and perimeter of a shape
    private static void displayResults(Drawable shape) {
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
    }
}