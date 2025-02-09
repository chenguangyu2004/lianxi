package JueJin;

import java.util.*;

public class Di29Ti {
    // 缓存，用于存储字符和操作次数的结果
    private static Map<String, String> cache = new HashMap<>();

    public static String solution(String s, int k) {
        if (k == 0) {
            return s; // 如果操作次数为 0，直接返回原字符串
        }

        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            result.append(transform(c, k)); // 对每个字符进行 k 次变换
        }
        return result.toString();
    }

    // 递归函数，计算字符 c 经过 k 次操作后的结果
    private static String transform(char c, int k) {
        if (k == 0) {
            return String.valueOf(c); // 如果操作次数为 0，直接返回字符
        }

        // 检查缓存中是否已经计算过
        String key = c + "," + k;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        // 根据字符的变换规则递归计算
        String result;
        if (c == 'a') {
            result = transform('b', k - 1) + transform('c', k - 1);
        } else if (c == 'b') {
            result = transform('c', k - 1) + transform('a', k - 1);
        } else if (c == 'c') {
            result = transform('a', k - 1) + transform('b', k - 1);
        } else {
            result = ""; // 处理非法字符
        }

        // 将结果存入缓存
        cache.put(key, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("abc", 2).equals("caababbcbcca")); // true
        System.out.println(solution("abca", 3).equals("abbcbccabccacaabcaababbcabbcbcca")); // true
        System.out.println(solution("cba", 1).equals("abcabc")); // true
    }
}
