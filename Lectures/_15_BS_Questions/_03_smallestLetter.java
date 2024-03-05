//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
//744. Find Smallest Letter Greater Than Target

package _15_BS_Questions;

public class _03_smallestLetter {
    public static void main(String[] args) {
        char [] letters = {'c', 'f', 'j'};
        char target = 'c';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < letters[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }

            if (start == letters.length){
                return letters[0];
            }
//            either use both the above if or return letters[start % letters.length];
        }
        return letters[start];
//        return letters[start % letters.length];
    }
}
