package JueJin;

import java.util.*;
public class Di34Ti {
    public static int solution(int n, int[] nums) {
        // PLEASE DO NOT MODIFY THE FUNCTION SIGNATURE
        // write code here
        Arrays.sort(nums);

        // 使用集合来存储不同的分数
        Set<Integer> uniqueScores = new HashSet<>();
        for (int num : nums) {
            uniqueScores.add(num);
        }

        // 将集合转换为列表并排序
        List<Integer> sortedUniqueScores = new ArrayList<>(uniqueScores);
        Collections.sort(sortedUniqueScores, Collections.reverseOrder());

        // 返回第三大的分数，如果不足三个则返回最大的分数
        if (sortedUniqueScores.size() >= 3) {
            return sortedUniqueScores.get(2);
        } else {
            return sortedUniqueScores.get(0);
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(3, new int[]{3, 2, 1}) == 1);
        System.out.println(solution(2, new int[]{1, 2}) == 2);
        System.out.println(solution(4, new int[]{2, 2, 3, 1}) == 1);
    }
}
