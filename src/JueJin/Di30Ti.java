package JueJin;

public class Di30Ti {
    public static int solution(String s) {
        // 将字符串转换为小写，方便统计
        s = s.toLowerCase();

        // 统计 'k' 和 'u' 的出现次数
        int countK = 0;
        int countU = 0;

        for (char c : s.toCharArray()) {
            if (c == 'k') {
                countK++;
            } else if (c == 'u') {
                countU++;
            }
        }

        // 返回 'k' 和 'u' 的最小值，即最多能组成的 "ku" 的数量
        return Math.min(countK, countU);
    }

    public static void main(String[] args) {
        System.out.println(solution("AUBTMKAxfuu") == 1); // true
        System.out.println(solution("KKuuUuUuKKKKkkkkKK") == 6); // true
        System.out.println(solution("abcdefgh") == 0); // true
    }
}
