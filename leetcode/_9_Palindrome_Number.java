public class _9_Palindrome_Number {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    private static boolean isPalindrome(int x) {
        int num = x;
        int newNum = 0;

//        optimized code
        while(num > 0) {
            newNum = (newNum * 10) + (num % 10);
            num /= 10;
        }
        return newNum == x;

        /*while(num > 0) {
            int rem = num % 10;
            num /= 10;
            newNum = newNum * 10 + rem;
        }
        if(newNum == x){
            return true;
        }
        return false;*/
    }
}
