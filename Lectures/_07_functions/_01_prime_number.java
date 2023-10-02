package _07_functions;

public class _01_prime_number {
    public static void main(String[] args) {
        int num = 11;
        if (isPrime(num)) {
            System.out.println("Prime");
        }else
            System.out.println("Not prime");
    }

    static boolean isPrime(int num) {
        int i = 2;
        boolean flag = true;
        while (i <= Math.sqrt(num)){
            if (num % i == 0) {
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
//    The time complexity of the isPrime function is O(√N), where N is the input number
//    The space complexity of the code is O(1)
}
