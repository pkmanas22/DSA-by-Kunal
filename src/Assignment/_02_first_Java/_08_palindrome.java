//8. To find out whether the given String is Palindrome or not.
package Assignment._02_first_Java;


import java.util.Scanner;

public class _08_palindrome {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int old= sc.nextInt();
        int temp = old;
        int num = 0;
        while(temp != 0){
            int rem = temp % 10;
            temp /= 10;
            num = rem + (num*10);
//            System.out.println(num);
        }
//        System.out.println(num);
//        System.out.println(old);
        if (old == num) {
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Given number is not Palindrome");
        }
    }
}
