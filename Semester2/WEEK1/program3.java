import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature (in Farenheit): ");
        int x = sc.nextInt();
        
        System.out.println("Temperature in Celcius is: " + ((x-32)/1.8));
        
    }
}
