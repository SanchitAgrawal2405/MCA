/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaweek3;
import java.util.*;

/**
 *
 * @author CSD
 */
public class Mcaweek3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        int c, a=0;
        int b=1;
        int sum=0;
        int z=3;
        if(n==1)
            System.out.print(a +" " );
        if(n==2){
            System.out.print(a +" " );
            System.out.print(b +" " );
        }
        else if(n>2){
            System.out.print(a +" " );
            System.out.print(b +" " );
             do{
                c=a+b;
                a=b;
                b=c;
                z++;
                System.out.print(c +" ");
            }while(z<=n);
        }
        // TODO code application logic here
    }
    
}
