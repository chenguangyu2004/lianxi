package JueJin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Di6Ti {
    public static int solution(int n, int H, int A, int[] h, int[] a) {
        List<int[]> eligible = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (h[i] < H && a[i] < A) {
                eligible.add(new int[]{h[i], a[i]});
            }
        }
        int m = eligible.size();
        if (m == 0) {
            return 0;
        }
        int[] dp = new int[m];
        Arrays.fill(dp, 1);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                if (eligible.get(j)[0] < eligible.get(i)[0] && eligible.get(j)[1] < eligible.get(i)[1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 4, 5, new int[]{1, 2, 3}, new int[]{3, 2, 1}) == 1);
        System.out.println(solution(5, 10, 10, new int[]{6, 9, 12, 4, 7}, new int[]{8, 9, 10, 2, 5}) == 2);
        System.out.println(solution(4, 20, 25, new int[]{10, 15, 18, 22}, new int[]{12, 18, 20, 26}) == 3);
    }
}
