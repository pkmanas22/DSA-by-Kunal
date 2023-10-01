package leetcode;

import java.util.ArrayList;

public class _557_ReverseWords_String_III {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] separate = s.split(" ");
        ArrayList<String> result = new ArrayList<>();
        for(String k : separate){
            String[] distinct = k.split("");
//            System.out.println(Arrays.toString(distinct));
            for (int i = distinct.length-1; i >= 0 ; i--) {
                result.add(distinct[i]);
            }
            result.add(" ");
//            System.out.println(result);
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < result.size()-1; i++) {
            String value = result.get(i);
            res.append(value);
        }
        return String.valueOf(res);
    }
}
