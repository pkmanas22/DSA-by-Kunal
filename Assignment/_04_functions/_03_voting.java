//      3. A person is eligible to vote if his/her age is greater than or equal to 18.
//          Define a method to find out if he/she is eligible to vote.

package Assignment._04_functions;


import java.util.Scanner;

public class _03_voting {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        vote(age);
    }

    static void vote(int age) {
        if (age >= 18){
            System.out.println("You can vote");
        }else
            System.out.println("Sorry, you can't vote");
    }
}
