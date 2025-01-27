import static java.lang.Math.*;
import java.util.Scanner;
public class MyNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element: ");
        double num= sc.nextDouble();
        double numRound = Math.round(num);
        double numCeil = Math.ceil(num);
        double numFloor = Math.floor(num);
        
        System.out.println("Round value is: " + numRound );
        System.out.println("Ceil value is: " + numCeil );
        System.out.println("Floor value is: " + numFloor );
        
    }
}
