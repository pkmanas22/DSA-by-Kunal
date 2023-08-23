//9. Calculate Batting Average

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _09_batting_average {
    public static void main(String[] args) {
        System.out.println("Enter batting score which is not out & (- value for quit): ");
        Scanner sc = new Scanner(System.in);
        double total = 0;
        while (true){
            int not_out =sc.nextInt();
            if (not_out < 0){
                break;
            }
            total += not_out;
        }
//        System.out.println("total = " + total);
        System.out.println("Enter your score which is out & (- value for quit): ");
        int count = 0;
        while (true){
            int out =sc.nextInt();
            if (out < 0){
                break;
            }
            total += out;
            count++;
        }
//        System.out.println("count = " + count);
//        System.out.println("total = " + total);
        double avg = total / count;
        System.out.printf("The average in your batting is %.2f" , avg);
    }
}
