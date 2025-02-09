package JueJin;

public class Di32Ti {
    public static int solution(int n, int A, int B, int[] array_a) {
        int totalSum = 0;
        // 计算数组中所有元素的总和
        for (int num : array_a) {
            totalSum += num;
        }
        // 计算总和的个位数
        int total_mod = totalSum % 10;

        // 如果总和的个位数等于A或B，则有一种特殊情况：一组为空，另一组为所有数字
        int case2 = (total_mod == A || total_mod == B) ? 1 : 0;

        int case1 = 0;
        // 计算所有可能的子集组合
        int maxMask = (1 << n) - 1;
        for (int mask = 1; mask < maxMask; mask++) {
            int sum = 0;
            // 计算当前子集的和
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += array_a[i];
                }
            }
            // 计算当前子集和的个位数
            int sum_S_mod = sum % 10;
            // 计算剩余子集和的个位数
            int sum_T_mod = (total_mod - sum_S_mod + 10) % 10;

            // 如果当前子集和的个位数等于A，且剩余子集和的个位数等于B，则满足条件
            if (sum_S_mod == A && sum_T_mod == B) {
                case1++;
            }
        }

        // 返回所有满足条件的划分方式的总数
        return case1 + case2;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 1, 1};
        int[] array2 = {1, 1, 1};
        int[] array3 = {1, 1};

        // 测试样例1
        System.out.println(solution(3, 1, 2, array1) == 3); // true
        // 测试样例2
        System.out.println(solution(3, 3, 5, array2) == 1); // true
        // 测试样例3
        System.out.println(solution(2, 1, 1, array3) == 2); // true
    }
}
