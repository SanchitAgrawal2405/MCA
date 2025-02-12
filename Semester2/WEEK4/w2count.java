package week4;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CSD
 */
public class w2count {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text:");
        String text = scanner.nextLine();

        int wordCount= 0;
        int sentenceCount = 0;
        int eCount = 0;
        int zCount = 0;

        boolean inWord = false;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != ' ' && ch != '\t' && ch != '\n') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
            if (ch == '.' || ch == '!' || ch == '?') {
                sentenceCount++;
            }
            if (ch == 'e' || ch == 'E') {
                eCount++;
            }
            if (ch == 'z' || ch == 'Z') {
                zCount++;
            }
        }
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of sentences: " + sentenceCount);
        System.out.println("Occurrences of letter 'e': " + eCount);
        System.out.println("Occurrences of letter 'z': " + zCount);
    }
}

