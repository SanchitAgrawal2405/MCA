package week_6;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three strings:");
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        if (compare(str1, str2) > 0) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        if (compare(str2, str3) > 0) {
            String temp = str2;
            str2 = str3;
            str3 = temp;
        }
        if (compare(str1, str2) > 0) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        System.out.println("Sorted order: " + str1 + " " + str2 + " " + str3);
    }
    private static int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = (len1 < len2) ? len1 : len2;
        
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }    
        return len1 - len2;
    }
}