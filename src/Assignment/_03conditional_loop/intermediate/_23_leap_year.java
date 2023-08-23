//23. Check Leap Year Or Not

package Assignment._03conditional_loop.intermediate;

import java.util.Scanner;

public class _23_leap_year {
    public static void main(String[] args) {
        System.out.println("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year =sc.nextInt();
        boolean flag = false;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0) {
                    flag = true;
//                    System.out.println("Leap year");
                }
//                else System.out.println("Not a leap year");
            }else
                flag = true;
//                System.out.println("Leap year");
        }
//        else System.out.println("Not a leap year");
        if (flag){
            System.out.println(year + " is a leap year");
        }
        else System.out.println(year + " is a not a leap year");
    }
}
