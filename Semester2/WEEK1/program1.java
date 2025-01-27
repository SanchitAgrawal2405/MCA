import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter House Number:  ");
        String a = sc.nextLine();
        System.out.println("Enter Street: ");
        String b = sc.nextLine();
        System.out.println("Enter District: ");
        String c = sc.nextLine();
        System.out.println("Enter Pincode: ");
        int d = sc.nextInt();
        
        System.out.println("Adress is : " + a + " , "+b+" , "+c+" , "+d);       

    }
}