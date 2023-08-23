//2. Take name as input and print a greeting message for that particular name.
package Assignment._02_first_Java;

import  java.util.Scanner;

public class _02_greetings {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Happy Holi, " + name);
    }
}
