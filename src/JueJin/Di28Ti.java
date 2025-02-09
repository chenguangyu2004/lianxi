package JueJin;

import java.util.LinkedList;
import java.util.Queue;

public class Di28Ti {
    public static int solution(int N, int M, char[][] data) {
        // 1. 找到出口的位置
        int ox = -1, oy = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (data[i][j] == 'O') {
                    ox = i;
                    oy = j;
                    break;
                }
            }
            if (ox != -1) break; // 提前终止外层循环
        }

        // 如果没有出口，所有位置都是危险的
        if (ox == -1) {
            return N * M;
        }

        // 2. 初始化BFS队列和访问标记数组
        boolean[][] visited = new boolean[N][M];
        Queue<int[]> queue = new LinkedList<>();
        visited[ox][oy] = true; // 出口本身可达
        queue.offer(new int[]{ox, oy});

        // 定义四个移动方向：上、下、左、右
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // 3. 反向BFS遍历所有可达点
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1];

            // 处理普通地板的情况：可以从四个方向移动过来
            for (int[] dir : dirs) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                // 检查边界和是否未访问
                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    // 如果是普通地板且未被访问，标记为可达
                    if (data[nx][ny] == '.' && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }

            // 处理传送器的情况（反向逻辑）：
            // ----------------------------------------------------------------
            // 4.1 检查下方的格子是否是'U'传送器（从U传送到当前位置）
            int nx = x + 1;
            int ny = y;
            if (nx < N && data[nx][ny] == 'U' && !visited[nx][ny]) {
                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny});
            }

            // 4.2 检查上方的格子是否是'D'传送器（从D传送到当前位置）
            nx = x - 1;
            if (nx >= 0 && data[nx][y] == 'D' && !visited[nx][y]) {
                visited[nx][y] = true;
                queue.offer(new int[]{nx, y});
            }

            // 4.3 检查右侧的格子是否是'L'传送器（从L传送到当前位置）
            ny = y + 1;
            if (ny < M && data[x][ny] == 'L' && !visited[x][ny]) {
                visited[x][ny] = true;
                queue.offer(new int[]{x, ny});
            }

            // 4.4 检查左侧的格子是否是'R'传送器（从R传送到当前位置）
            ny = y - 1;
            if (ny >= 0 && data[x][ny] == 'R' && !visited[x][ny]) {
                visited[x][ny] = true;
                queue.offer(new int[]{x, ny});
            }
        }

        // 5. 统计危险位置的数量（未被访问的格子）
        int dangerous = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    dangerous++;
                }
            }
        }
        return dangerous;
    }

    public static void main(String[] args) {
        // 测试用例（预期输出10个危险位置）
        char[][] pattern = {
                {'.',  '.', '.', '.', '.'},
                {'.',  'R', 'R', 'D', '.'},
                {'.', 'U', '.', 'D', 'R'},
                {'.', 'U', 'L', 'L', '.'},
                {'.', '.', '.', '.', 'O'}
        };
        System.out.println(solution(5, 5, pattern) == 10); // 应输出true
    }
}
