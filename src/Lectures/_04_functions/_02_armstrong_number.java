package Lectures._04_functions;

//to check whether a given number is an Armstrong number or not
public class _02_armstrong_number {
    public static void main(String[] args) {
        int n = 153;
        int count = countDigit(n);
        System.out.println(isArmstrong(n,count));

    }

    private static boolean isArmstrong(int n, int count) {
        int num = n;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            sum += (int) Math.pow(rem,count);
        }
        return sum == n;
    }
//    The time complexity of the isArmstrong function is O(log N), where N is the input number.


    //        for counting the digits
    private static int countDigit(int num) {
        int temp = num;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count;
    }
//    The time complexity of the countDigit function is also O(log N) since it counts the number of digits in the given number.
//The space complexity of the whole code is O(1)
}
