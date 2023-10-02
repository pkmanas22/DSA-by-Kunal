package Lectures._03conditional_loop;

import java.util.Scanner;

public class _02_case_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);   // trim removes all extra space
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        }else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        }else
            System.out.println("Invalid");
    }
}
