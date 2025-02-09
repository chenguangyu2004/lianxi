import java.util.*;

public class DiWuTi {
    public static int[] solution(int n, int max, int[] array) {
        // 统计每个牌面值的频率
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int card : array) {
            frequencyMap.put(card, frequencyMap.getOrDefault(card, 0) + 1);
        }

        // 找出所有可能的“葫芦”组合
        List<int[]> fullHouseList = new ArrayList<>();
        for (int a : frequencyMap.keySet()) {
            if (frequencyMap.get(a) >= 3) {
                for (int b : frequencyMap.keySet()) {
                    if (b != a && frequencyMap.get(b) >= 2) {
                        // 计算牌面值之和，A（1）的值是 1
                        int sum = 3 * (a == 1 ? 1 : a) + 2 * (b == 1 ? 1 : b);
                        if (sum <= max) {
                            fullHouseList.add(new int[]{a, b});
                        }
                    }
                }
            }
        }

        // 如果没有符合条件的“葫芦”组合，返回 [0, 0]
        if (fullHouseList.isEmpty()) {
            return new int[]{0, 0};
        }

        // 找出最大的“葫芦”组合
        // 优先比较三张相同牌面值 a，再比较两张相同牌面值 b
        // A（1）在比较时是最大的
        int[] maxFullHouse = fullHouseList.get(0);
        for (int[] fullHouse : fullHouseList) {
            if (compareFullHouse(fullHouse, maxFullHouse) > 0) {
                maxFullHouse = fullHouse;
            }
        }

        return maxFullHouse;
    }

    // 比较两个“葫芦”组合的大小
    // A（1）在比较时是最大的
    private static int compareFullHouse(int[] fh1, int[] fh2) {
        // 比较三张相同牌面值 a
        int a1 = fh1[0] == 1 ? 14 : fh1[0]; // A 视为 14
        int a2 = fh2[0] == 1 ? 14 : fh2[0];
        if (a1 != a2) {
            return a1 - a2;
        }
        // 比较两张相同牌面值 b
        int b1 = fh1[1] == 1 ? 14 : fh1[1]; // A 视为 14
        int b2 = fh2[1] == 1 ? 14 : fh2[1];
        return b1 - b2;
    }

    public static void main(String[] args) {
        // 测试用例
        System.out.println(java.util.Arrays.equals(solution(9, 34, new int[]{6, 6, 6, 8, 8, 8, 5, 5, 1}), new int[]{8, 5}));
        System.out.println(java.util.Arrays.equals(solution(9, 37, new int[]{9, 9, 9, 9, 6, 6, 6, 6, 13}), new int[]{6, 9}));
        System.out.println(java.util.Arrays.equals(solution(9, 40, new int[]{1, 11, 13, 12, 7, 8, 11, 5, 6}), new int[]{0, 0}));
        System.out.println(java.util.Arrays.equals(solution(6, 50, new int[]{13, 13, 13, 1, 1, 1}), new int[]{1, 13}));
    }
}
/*
优化之后的代码：优化点：
使用 Math.max 简化比较逻辑：
在 compareFullHouse 方法中，使用 Math.max 来简化 A（1）的处理逻辑。
使用 TreeSet 存储“葫芦”组合：
使用 TreeSet 并自定义比较器，利用其自动排序功能，避免手动遍历和比较。
import java.util.*;

public class Main {
    public static int[] solution(int n, int max, int[] array) {
        // 统计每个牌面值的频率
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int card : array) {
            frequencyMap.put(card, frequencyMap.getOrDefault(card, 0) + 1);
        }

        // 使用 TreeSet 存储“葫芦”组合，并自定义比较器
        TreeSet<int[]> fullHouseSet = new TreeSet<>((fh1, fh2) -> {
            // 比较三张相同牌面值 a
            int a1 = fh1[0] == 1 ? 14 : fh1[0]; // A 视为 14
            int a2 = fh2[0] == 1 ? 14 : fh2[0];
            if (a1 != a2) {
                return a2 - a1; // 从大到小排序
            }
            // 比较两张相同牌面值 b
            int b1 = fh1[1] == 1 ? 14 : fh1[1]; // A 视为 14
            int b2 = fh2[1] == 1 ? 14 : fh2[1];
            return b2 - b1; // 从大到小排序
        });

        // 找出所有可能的“葫芦”组合
        for (int a : frequencyMap.keySet()) {
            if (frequencyMap.get(a) >= 3) {
                for (int b : frequencyMap.keySet()) {
                    if (b != a && frequencyMap.get(b) >= 2) {
                        // 计算牌面值之和，A（1）的值是 1
                        int sum = 3 * (a == 1 ? 1 : a) + 2 * (b == 1 ? 1 : b);
                        if (sum <= max) {
                            fullHouseSet.add(new int[]{a, b});
                        }
                    }
                }
            }
        }

        // 如果没有符合条件的“葫芦”组合，返回 [0, 0]
        if (fullHouseSet.isEmpty()) {
            return new int[]{0, 0};
        }

        // 返回最大的“葫芦”组合
        return fullHouseSet.first();
    }

    public static void main(String[] args) {
        // 测试用例
        System.out.println(java.util.Arrays.equals(solution(9, 34, new int[]{6, 6, 6, 8, 8, 8, 5, 5, 1}), new int[]{8, 5}));
        System.out.println(java.util.Arrays.equals(solution(9, 37, new int[]{9, 9, 9, 9, 6, 6, 6, 6, 13}), new int[]{6, 9}));
        System.out.println(java.util.Arrays.equals(solution(9, 40, new int[]{1, 11, 13, 12, 7, 8, 11, 5, 6}), new int[]{0, 0}));
        System.out.println(java.util.Arrays.equals(solution(6, 50, new int[]{13, 13, 13, 1, 1, 1}), new int[]{1, 13}));
    }
}
 */



