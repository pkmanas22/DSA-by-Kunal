
/*8. Write a program that will ask the user to enter his/her marks (out of 100).
        Define a method that will display grades according to the marks entered as below:
        Marks        Grade
        91-100         AA
        81-90          AB
        71-80          BB
        61-70          BC
        51-60          CD
        41-50          DD
        <=40          Fail

 */

package Assignment._04_functions;

import java.util.Scanner;

public class _08_grade_system {
    public static void main(String[] args) {
        System.out.println("Enter your mark (Out of 100): ");
        Scanner sc = new Scanner(System.in);
        int mark =sc.nextInt();
        String display = grade(mark);
        System.out.println(display);
    }

    static String grade(int mark) {
        if (mark > 90 && mark <= 100){
            return "AA";
        } else if (mark > 80 && mark <= 90) {
            return "AB";
        }else if (mark > 70 && mark <= 80) {
            return "BB";
        }else if (mark > 60 && mark <= 70) {
            return "BC";
        }else if (mark > 50 && mark <= 60) {
            return "CD";
        }else if (mark > 40 && mark <= 50) {
            return "DD";
        } else if (mark <= 40) {
            return "FAIL";
        }
        return null;
    }
}
