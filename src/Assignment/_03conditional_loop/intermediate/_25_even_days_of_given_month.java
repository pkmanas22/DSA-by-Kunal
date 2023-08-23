//      25. Kunal is allowed to go out with his friends only on the even days of a given month.
//          Write a program to count the number of days he can go out in the month of August.

package Assignment._03conditional_loop.intermediate;

public class _25_even_days_of_given_month {
    public static void main(String[] args) {
        int noOfDays = 31;      // for August
        int count = 0;
        for (int i = 1; i <= noOfDays; i++){
            if(i % 2 == 0){
                count++;
                System.out.println(count + ". August " + i);
            }
        }
    }
}
