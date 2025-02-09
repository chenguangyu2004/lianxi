package JueJin;

public class Di2Ti {
    public static int solution(int n, int k, int[] data) {
        int[][] dp = new int[n + 1][k + 1];
        // Initialize with a large value (since maximum data[i] is 1e4, 1e9 is sufficient)
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0; // Starting with day 0 and 0 food

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                if (dp[i][j] == Integer.MAX_VALUE) continue;
                // Iterate over possible amounts to buy
                for (int buy = 0; buy <= k; buy++) {
                    // The maximum allowed buy is k - current remaining
                    if (buy > (k - j)) continue;
                    int newJ = j + buy - 1; // After consuming 1 for the day
                    if (newJ < 0) continue; // Not possible to have negative food
                    if (newJ > k) continue; // Not allowed to exceed capacity
                    int newCost = dp[i][j] + buy * data[i];
                    if (newCost < dp[i + 1][newJ]) {
                        dp[i + 1][newJ] = newCost;
                    }
                }
            }
        }
        // The answer is the minimum cost after n days with any remaining food
        int minCost = Integer.MAX_VALUE;
        for (int j = 0; j <= k; j++) {
            if (dp[n][j] < minCost) {
                minCost = dp[n][j];
            }
        }
        return minCost;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] data1 = {4, 1, 5, 2, 1, 3};
        System.out.println(solution(6, 3, data1)); // Expected output: 9

        // Test case 2
        int[] data2 = {1, 2, 3, 3, 2};
        System.out.println(solution(5, 2, data2)); // Expected output: 9
    }
}
