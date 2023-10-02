//https://leetcode.com/problems/richest-customer-wealth/description/
//1672. Richest Customer Wealth
//        You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
//
//        A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
public class _1672_RichestCustomer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7}, {7,1,3}, {1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        int [] wealths = new int[accounts.length];
        for (int customer = 0; customer < accounts.length; customer++) {
            for(int balance : accounts[customer]){
                wealths[customer] += balance;
            }
        }

        for (int wealth : wealths){
            if (wealth > max){
                max = wealth;
            }
        }
        return max;
    }
}
