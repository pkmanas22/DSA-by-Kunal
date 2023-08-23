//4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package Assignment._02_first_Java;

import java.util.Scanner;

public class _04_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        System.out.print("Enter the operator: ");
        char op = sc.next().charAt(0);

        float result = 0f;
        if (op == '+' || op == '-' || op == '*' || op == '/'){
            if(op == '+'){
                result = n1 + n2;
            } else if (op == '-') {
                result = n1 - n2;
            } else if (op == '*') {
                result = n1 * n2;
            }else {
                result = n1 / n2;
            }
        }else System.out.println("Warning!!! Please enter valid operator.");
        System.out.println(result);
    }
}

