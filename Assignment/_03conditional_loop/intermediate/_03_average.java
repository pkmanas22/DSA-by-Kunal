//3. Calculate Average Of N Numbers

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _03_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.println("Enter the number: ");
        int count = 0;
//        while (input != 0){
//            sum += input;
//            System.out.println("Enter the number: ");
//            input = sc.nextInt();
//            count++;
//        }
//        Another Approach
        while (true){
            int input = sc.nextInt();
            sum += input;
            if(input == 0){
                break;
            }
            count++;
        }
        System.out.println("Average of all given numbers is " + (sum/count));
    }
}
