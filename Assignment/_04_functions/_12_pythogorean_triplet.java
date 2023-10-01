//12. Write a function to check if a given triplet is a Pythagorean triplet or not.
//        (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).


package Assignment._04_functions;

import java.util.Scanner;

public class _12_pythogorean_triplet {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        int n3 =sc.nextInt();
        pythogoreanTriplet(n1,n2,n3);
    }

    static void pythogoreanTriplet(int n1, int n2, int n3) {
        int max1 = Math.max(n1,n2);
        int max2 = Math.max(max1,n3);
        int x = 0,y = 0;
        if (max2 ==  n1){
            x = n2;
            y= n3;
        } else if (max2 ==  n2){
            x = n1;
            y= n3;
        } else if (max2 ==  n3){
            x = n1;
            y= n2;
        }

        if ((max2 * max2) == ((x * x) + (y * y))){
            System.out.println("This is a pythogorean triplet.");
        }else
            System.out.println("This is not a pythogorean triplet.");
    }
}
