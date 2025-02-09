package JueJin;

public class DiSiTi {
    // 递归方法
    public static int solution(int[] numbers) {
        return process(numbers, 0, 0, 0);
    }

    // 参数：numbers 数字组，index 当前处理的数字组索引，sum 当前选择的数字之和，oddCnt 当前选择的奇数个数
    private static int process(int[] numbers, int index, int sum, int oddCnt) {
        // 如果已经处理完所有数字组
        if (index == numbers.length) {
            // 如果当前数字之和为偶数，则返回1，表示找到一种符合条件的方法
            return sum % 2 == 0 ? 1 : 0;
        } else {
            int res = 0;
            // 遍历当前数字组中的每个数字
            String numStr = String.valueOf(numbers[index]);
            for (char c : numStr.toCharArray()) {
                int digit = c - '0';
                // 递归处理下一个数字组
                res += process(numbers, index + 1, sum + digit, oddCnt + (digit % 2 == 1 ? 1 : 0));
            }
            return res;
        }
    }



    public static void main(String[] args) {
        // You can add more test cases here
        System.out.println(solution(new int[]{123, 456, 789}) == 14);
        System.out.println(solution(new int[]{123456789}) == 4);
        System.out.println(solution(new int[]{14329, 7568}) == 10);
    }
}
