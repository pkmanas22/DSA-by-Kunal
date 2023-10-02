package _06_conditional_loop;

import java.util.Scanner;

public class _01_largest_number {
//    Write a Java program that reads three integer inputs from the user and then determines and prints the largest among them
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1, n2, n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        /*if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is the largest.");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is the largest.");
        }else
            System.out.println(n3 + " is the largest.");*/

        /*int max = n1;
        if (n2 >= max)
            max =n2;
        if (n3 >= max){
            max = n3;
        }
        System.out.println(max);*/

        System.out.println(Math.max(Math.max(n1,n2),n3));

//        All methods of time complexity and space complexity is O(1)
    }
}
