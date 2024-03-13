package _06_searching.easy;

//441. Arranging Coins
//https://leetcode.com/problems/arranging-coins/description/

public class _06_arrangingCoins {
    public static void main(String[] args) {
        int n = 2147483647;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        while (start <= end){
            long mid = start + (end -start) /2;
            long flag = mid * (mid + 1) / 2; // n(n+1)/2
            if (flag == (long) n){
                return (int) mid;
            }
            if (flag > (long) n){
                end = mid-1;
            }else {
                start = mid + 1;
            }
        }
        return (int) (end);
    }

    /*public static int arrangeCoins(int n) {
        long start = 1;
        long total = 1;
        while (total <= n){
            start++;
            total += start;
        }
        return (int) (start-1);
    }           O(N)        */
}
