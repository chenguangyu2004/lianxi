package JueJin;

public class Di26Ti {
    /*法一：
    我们需要从前往后遍历 aStr，找到 第一个 使得 bChar 大于当前字符的位置，然后将 bChar 插入到该位置之前。
    如果没有这样的位置，则将 bChar 插入到字符串末尾。还要考虑b是否是多位数
    public static int solution(int a, int b) {
        // 将a和b转换为字符串
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        int maxNum = Integer.MIN_VALUE;

        // 遍历所有可能的插入位置
        for (int i = 0; i <= aStr.length(); i++) {
            // 在位置i插入bStr
            String newStr = aStr.substring(0, i) + bStr + aStr.substring(i);
            // 将新字符串转换为整数
            int newNum = Integer.parseInt(newStr);
            // 更新最大值
            if (newNum > maxNum) {
                maxNum = newNum;
            }
        }

        return maxNum;
    }
     */

    //法二：将数字 a 转换为字符串：这样我们可以方便地在不同位置插入数字 b。
    //遍历所有可能的插入位置：对于每一个可能的位置，将 b 插入到该位置，并生成一个新的数字。
    //比较所有生成的新数字：找到其中最大的一个数字并返回。
    public static int solution(int a, int b) {
        // 将数字a转换为字符串
        String aStr = Integer.toString(a);
        int maxNum = Integer.MIN_VALUE;

        // 遍历所有可能的插入位置
        for (int i = 0; i <= aStr.length(); i++) {
            // 在位置i插入数字b
            String newStr = aStr.substring(0, i) + b + aStr.substring(i);
            // 将新字符串转换为整数
            int newNum = Integer.parseInt(newStr);
            // 更新最大值
            if (newNum > maxNum) {
                maxNum = newNum;
            }
        }

        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println(solution(76543, 4)); // 765443
        System.out.println(solution(1, 0));     // 10
        System.out.println(solution(44, 5));    // 544
        System.out.println(solution(666, 6));   // 6666
        System.out.println(solution(1234, 5));  // 51234
        System.out.println(solution(10, 0));    // 100
    }
}
