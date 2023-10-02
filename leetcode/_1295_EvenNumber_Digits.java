//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//1295. Find Numbers with Even Number of Digits
//        Given an array nums of integers, return how many of them contain an even number of digits.
public class _1295_EvenNumber_Digits {
    public static void main(String[] args) {
        int[] num = {-12,345,2,625423,7896};
        System.out.println(findNumbers(num));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums){
            if (isEvenDigit(n)){
                count++;
            }
        }
        return count;
    }

    static boolean isEvenDigit(int n) {
        int count = (int)(Math.log10(n))+1;
        return count % 2 == 0;
    }

    /*static boolean isEvenDigit(int n) {
        int c = 0;
        while (n != 0){
            n /= 10;
            c++;
        }
        return c%2==0;
    }*/
}
