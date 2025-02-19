package week_6;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        
        char[] charArray = sentence.toCharArray();
        int start = 0;
        for (int i = 0; i <= charArray.length; i++) {
            if (i == charArray.length || charArray[i] == ' ' || isPunctuation(charArray[i])) {
                reverse(charArray, start, i - 1);
                start = i + 1;
            }
        }      
        System.out.println("Reversed sentence:");
        System.out.println(new String(charArray));
    }
    private static void reverse(char[] array, int left, int right) {
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }   
    private static boolean isPunctuation(char c) {
        return c == '.' || c == ',' || c == '!' || c == '?' || c == ';' || c == ':';
    }
}
