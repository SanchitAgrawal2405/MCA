import java.util.Scanner;
public class w2program5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        int num = 1;
        System.out.println("Floyd's Triangle (Pattern 1):");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println("Floyd's Triangle (Pattern 2):");
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
    }
}