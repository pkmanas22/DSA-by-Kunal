package _23_Recursion;

public class _02_nth_fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    static int fibo (int n) {

        // base condition
        if (n < 2) return n;

        return fibo(n-1) + fibo(n-2);
    }
}
