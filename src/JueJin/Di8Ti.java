package JueJin;

public class Di8Ti {
    public static int solution(int[] array) {
        int n = array.length;
        int candidate = array[0];
        int count = 1;

        // 摩尔投票算法
        for (int i = 1; i < n; i++) {
            if (count == 0) {
                candidate = array[i];
                count = 1;
            } else if (array[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // 验证 candidate 是否确实是出现次数超过一半的数字
        count = 0;
        for (int num : array) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element found");
        }
    }

    public static void main(String[] args) {
        // Add your test cases here

        System.out.println(solution(new int[]{1, 3, 8, 2, 3, 1, 3, 3, 3})) ;
    }
}
