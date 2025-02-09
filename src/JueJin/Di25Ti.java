package JueJin;

public class Di25Ti { //第25题
    public static int solution(String dna1, String dna2) {
        // Please write your code here
        int m = dna1.length();
        int n = dna2.length();

        // 创建一个二维数组来存储子问题的解
        int[][] dp = new int[m + 1][n + 1];

        // 初始化边界条件
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // 填充dp数组
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (dna1.charAt(i - 1) == dna2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + 1);
                }
            }
        }

        // 返回最终结果
        return dp[m][n];
    }

    public static void main(String[] args) {
        //  You can add more test cases here
        System.out.println(solution("AGCTTAGC", "AGCTAGCT") == 2);
        System.out.println(solution("AGCCGAGC", "GCTAGCT") == 4);
    }
}
