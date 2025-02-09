package JueJin;

public class Di55Ti {
    public static int solution(int x, int y) {
        double d = Math.sqrt(x * x + y * y);
        int i = (int) Math.ceil(d);
        if (i == 0) { // 处理d=0的情况，确保i=1
            i = 1;
        }
        if (i > 10) {
            return 0;
        } else {
            return 11 - i;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 0) == 10);
        System.out.println(solution(1, 1) == 9);
        System.out.println(solution(0, 5) == 6);
        System.out.println(solution(3, 4) == 6);
    }
}
