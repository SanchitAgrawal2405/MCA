import static java.lang.Math.*;
import java.util.Scanner;
public class program5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first element: ");
        double num1= sc.nextDouble();
        System.out.println("Enter second element: ");
        double num2= sc.nextDouble();
        
        double numRound = Math.round(num1);
        double numCeil = Math.ceil(num1);
        double numFloor = Math.floor(num1);
        double numSqrt = Math.sqrt(num1);
        double numAbs = Math.abs(num1);
        double numMin = Math.min(num1,num2);
         double numMax = Math.max(num1,num2);
        
        
        System.out.println("Round value num1: " + numRound );
        System.out.println("Ceil value num1: " + numCeil );
        System.out.println("Floor value num1: " + numFloor );
        System.out.println("Square Root value num1: " + numSqrt );
        System.out.println("Absolute value num1: " + numAbs );
        System.out.println("Minimum value num1: " + numMin );
        System.out.println("Maximum value num1: " + numMax);
        
    }
}
