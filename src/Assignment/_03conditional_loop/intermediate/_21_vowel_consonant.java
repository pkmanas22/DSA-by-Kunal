//21. Java Program Vowel Or Consonant
//a-z : 97-122
//A-Z : 65-90

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _21_vowel_consonant {
    public static void main(String[] args) {
        System.out.println("Enter the letter: ");
        Scanner sc = new Scanner(System.in);
        String inp = sc.next().toLowerCase();
        char input = inp.charAt(0);
        if (input >= 97 && input <= 122) {
            if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
                System.out.println(input + " is vowel.");
            } else System.out.println(input + " is consonant.");
        }
    }
}
