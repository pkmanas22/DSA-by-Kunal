//22. Perfect Number In Java
//28 = 1+2+4+7+14


package Assignment._03conditional_loop.intermediate;

import static java.lang.Math.pow;

public class _22_perfect_number {
    public static void main(String[] args) {
        int perfect = 2;
        for (int p = 2; (p < 100) && (perfect < 500); p++) {
            boolean flag = false;
            for (int i = 2; i < p; i++){
                if (p % i == 0){
                    flag = true;
                    break;
                }
            }
            if (!flag){
//                System.out.println("Prime");
                System.out.println(p);
                perfect = (int) (pow(2,(p-1)) * (pow(2,p)-1));
                System.out.println(perfect);
            }
        }
    }
}
