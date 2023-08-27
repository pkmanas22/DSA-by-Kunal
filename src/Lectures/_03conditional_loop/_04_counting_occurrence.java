package Lectures._03conditional_loop;

import java.util.Scanner;

//counting the occurrences of a specific digit in a given number
public class _04_counting_occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.print("Enter the targeted digit: ");
        int tNo = sc.nextInt();
        int count = 0;
        /*while (num > 0) {
            int rem = (int) (num % 10);
            if (rem == tNo) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);*/
        //    The time complexity of this program is O(log N), where N is the value of the input number.
        //The space complexity of this program is O(1), which means it uses a constant amount of extra space regardless of the input size

//        Better approach
        String no = String.valueOf(num);
        char target = String.valueOf(tNo).charAt(0);
        for (int i = 0; i < no.length(); i++){
            if (no.charAt(i) == target) {
                count++;
            }
        }
        System.out.println(count);
//        The time and space complexity of this program is O(log N)
    }
}
