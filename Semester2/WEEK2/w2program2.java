import java.util.Scanner;
public class w2program2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the range: ");
        int end = scanner.nextInt();
        
        for (int i = 1; i <= end; i++) {
            System.out.println("Number: " + i + " Square: " + (i * i) + " Cube: " + (i * i * i));
        }
    }
}