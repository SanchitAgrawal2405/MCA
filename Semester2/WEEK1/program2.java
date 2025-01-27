import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first element: ");
        int x = sc.nextInt();
        System.out.println("Enter first element: ");
        int y = sc.nextInt();
        
        System.out.println("sum is: " + (x+y));
        System.out.println("Difference is: " + (x-y));
        System.out.println("Multiply is: " + (x*y));
        System.out.println("Divide is: " + (x/y));
       
        if(x>y){
	System.out.println("Minimum is: " + y);
        	System.out.println("Maximum is: " + x);
        }
         else{
	System.out.println("Minimum is: " + x);
        	System.out.println("Maximum is: " + y);
        }
    }
}
