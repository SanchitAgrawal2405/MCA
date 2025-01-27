import java.util.Scanner;
public class w2program4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= N; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even terms: " + sum);
    }
}