//16. Reverse A String In Java

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _16_reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String  input = sc.nextLine();
//        String input = "Manas";
        int len = input.length();
//        System.out.println(input.length());
//        System.out.println(input.charAt(len-1));
        for (int i = len-1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
