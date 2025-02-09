package JueJin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Di13Ti {
    /*public static int[] solution(int n) {
        // PLEASE DO NOT MODIFY THE FUNCTION SIGNATURE
        // write code here
        int array[]=new int[1000];
        int count = 0;
        for(int i=1;i<=n;i++){
            for(int j = n;j>=i;j--){
                array[count]=j;
                count++;
            }
        }
        return Arrays.copyOf(array, count);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.equals(solution(3), new int[]{3, 2, 1, 3, 2, 3}));
        System.out.println(Arrays.equals(solution(4), new int[]{4, 3, 2, 1, 4, 3, 2, 4, 3, 4}));
        System.out.println(Arrays.equals(solution(5), new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5}));
    }
     */
    public static List<Integer> solution(int n) {
        // PLEASE DO NOT MODIFY THE FUNCTION SIGNATURE
        // write code here
        List<Integer> array = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                array.add(j);
            }
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(solution(3).equals(Arrays.asList(3, 2, 1, 3, 2, 3)));
        System.out.println(solution(4).equals(Arrays.asList(4, 3, 2, 1, 4, 3, 2, 4, 3, 4)));
        System.out.println(solution(5).equals(Arrays.asList(5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5)));
    }


}
