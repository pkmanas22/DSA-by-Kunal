//28. Minimum Cost to Move Chips to The Same Position
//
//    We have n chips, where the position of the ith chip is position[i].
//
//    We need to move all the chips to the same position. In one step,
//        we can change the position of the ith chip from position[i] to:
//
//    position[i] + 2 or position[i] - 2 with cost = 0.
//    position[i] + 1 or position[i] - 1 with cost = 1.
//    Return the minimum cost needed to move all the chips to the same position.
//
//Example 1:
//
//    Input: position = [1,2,3]
//    Output: 1
//    Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
//    Second step: Move the chip at position 2 to position 1 with cost = 1.
//    Total cost is 1.
//
//Example 2:
//
//    Input: position = [2,2,2,3,3]
//    Output: 2
//    Explanation: We can move the two chips at position  3 to position 2. Each move has cost = 1. The total cost = 2.


package Assignment._05_arrays.Easy;

public class _28_minimum_cost_to_move {
    public static void main(String[] args) {
        int[] position =  {1,2,3};
        int odd = 0;
        int even = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0){
                even++;
            }
            else odd++;
        }
//        System.out.println("even = " + even);
//        System.out.println("odd = " + odd);
        int cost = Math.min(even,odd);

        System.out.println("cost = " + cost);
    }
}
