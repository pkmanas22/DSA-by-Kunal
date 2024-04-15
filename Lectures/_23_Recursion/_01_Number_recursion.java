package _23_Recursion;

public class _01_Number_recursion {
    public static void main(String[] args) {
        numPrint(1);
    }

//    this is recursion
    private static void numPrint(int i) {
        System.out.println(i);
        if(i == 5) return;
        numPrint(i+1); // calling sam function
    }
}
