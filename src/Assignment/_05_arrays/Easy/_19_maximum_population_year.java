//19. Maximum Population Year

package Assignment._05_arrays.Easy;

public class _19_maximum_population_year {
    public static void main(String[] args) {
        int [][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        int [] year  = new int[2050];
        for (int [] arr: logs) {
            year[arr[0]] +=1;
            year[arr[1]] -= 1;
        }
        int maxNum = year[1950];
        int maxYear = 1950;

        for (int i = 1950; i < year.length; i++) {
            year[i] += year[i-1];

            if (year[i] > maxNum){
                maxNum = year[i];
                maxYear = i;
            }
        }
        System.out.println(maxYear);
    }
}
