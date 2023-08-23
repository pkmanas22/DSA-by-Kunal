//23. Input a number and print all the factors of that number (use loops).

package Assignment._03conditional_loop.basic;

import java.util.Scanner;

public class _23_factors_of_number {
    public static void main(String[] args) {
        System.out.print("Enter the integer: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("The factors of " + input + " is :");
        for (int i = 1; i <= Math.sqrt(input); i++){
            if (input % i == 0){
                System.out.print(i + ", ");
            }
        }
        for (int i = (int) Math.sqrt(input); i >= 1; i--){
            if(i == Math.sqrt(input)){

            }

            else if (input % i == 0){
                System.out.print((input/i) + ", ");
            }
        }
    }
}
