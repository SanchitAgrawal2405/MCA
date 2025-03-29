/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author CSD
 */
public class test {
    public static void main(String[] args) {
        try{
            int a = 5 / 0;
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero error.");
        }
        catch(NullPointerException e){
            System.out.println("Null pointer exeption");
        }
    }
    
}
