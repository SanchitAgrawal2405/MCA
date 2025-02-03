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
class Rectangle {
    int x1, y1, x2, y2;   
    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public Rectangle intersection(Rectangle r) {
        int ix1 = Math.max(this.x1, r.x1);
        int iy1 = Math.max(this.y1, r.y1);
        int ix2 = Math.min(this.x2, r.x2);
        int iy2 = Math.min(this.y2, r.y2);
        
        if (ix1 < ix2 && iy1 < iy2) {
            return new Rectangle(ix1, iy1, ix2, iy2);
        } else {
            return null; // No intersection
        }
    }
    public void print() {
    System.out.println("Rectangle Coordinates:");
    System.out.println("Bottom-Left: (" + x1 + ", " + y1 + ")");
    System.out.println("Top-Left: (" + x1 + ", " + y2 + ")");
    System.out.println("Top-Right: (" + x2 + ", " + y2 + ")");
    System.out.println("Bottom-Right: (" + x2 + ", " + y1 + ")");
}
}
public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter Bottom-Left (x1, y1) and Top-Right (x2, y2) for the first rectangle: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("Enter Bottom-Left (x1, y1) and Top-Right (x2, y2) for the second rectangle: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        
        Rectangle r1 = new Rectangle(x1, y1, x2, y2);
        Rectangle r2 = new Rectangle(x3, y3, x4, y4);
        
        r1.print();
        r2.print();
        
        Rectangle r3 = r1.intersection(r2);
        if (r3 != null) {
            System.out.println("Intersection Rectangle:");
            r3.print();
        } else {
            System.out.println("No intersection between the rectangles.");
        }
    }
}

