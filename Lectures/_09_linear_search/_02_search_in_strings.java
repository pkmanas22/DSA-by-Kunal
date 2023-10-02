package _09_linear_search;

public class _02_search_in_strings {
    public static void main(String[] args) {
        String name = "Manas";
        char target = 's';
//        System.out.println(search(name, target));
        System.out.println(search2(name, target));
    }

    static boolean search(String str, char target){
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

//    for-each
    static boolean search2(String str, char target){
        for (char ch : str.toCharArray()) {
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
