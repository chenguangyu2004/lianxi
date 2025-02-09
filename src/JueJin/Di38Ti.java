package JueJin;
import java.util.Arrays;
import java.util.Stack;

public class Di38Ti {
    public static int solution(int m, int n, int[][] p) {
        int[] nextLowerDay = new int[n];
        Arrays.fill(nextLowerDay, m); // 初始化为总天数，即M

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int currentPrice = p[i][1];
            while (!stack.isEmpty() && currentPrice < p[stack.peek()][1]) {
                int prev = stack.pop();
                nextLowerDay[prev] = p[i][0];
            }
            stack.push(i);
        }

        int currentDay = 0;
        int cost = 0;

        for (int i = 0; i < n; i++) {
            int a = p[i][0];
            int b = p[i][1];
            if (a < currentDay) continue;

            int nld = nextLowerDay[i];
            int end = Math.min(nld - 1, m - 1);
            int start = Math.max(currentDay, a);
            if (start > end) continue;

            int days = end - start + 1;
            cost += days * b;
            currentDay = end + 1;

            if (currentDay >= m) break;
        }

        return cost;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 4, new int[][]{{0, 2}, {1, 3}, {2, 1}, {3, 2}}) == 7);
        System.out.println(solution(1, 1, new int[][]{{0, 1}}) == 1);
        System.out.println(solution(3, 3, new int[][]{{0, 1}, {1, 2}, {2, 0}}) == 2);
        System.out.println(solution(3, 3, new int[][]{{0, 5}, {1, 3}, {2, 4}}) == 11);
    }
}

