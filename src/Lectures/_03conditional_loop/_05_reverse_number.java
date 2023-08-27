package Lectures._03conditional_loop;

public class _05_reverse_number {
    public static void main(String[] args) {
        int old = -123456;
        int num = 0;
        while (old != 0){
            int rem = old % 10;
            num = (num * 10) + rem;
            old /= 10;
        }
        System.out.println(num);
//        The time complexity of this code is O(log N), where N is the absolute value of the input number
//        The space complexity of this code is O(1), which means it uses a constant amount of extra space regardless of the input size.
    }
}
