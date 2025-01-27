import java.util.Scanner;
public class w2program1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        
        System.out.print("Enter the number of inputs: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
