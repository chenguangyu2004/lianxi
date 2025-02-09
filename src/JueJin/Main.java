package JueJin;

public class Main {
    public static int solution(int n, int l, int r, int[] a) {
        // PLEASE DO NOT MODIFY THE FUNCTION SIGNATURE
        // write code here
        int count = 0;
        for(int b:a){
            if(b>=l && b<=r){
                if(b%2 == 0){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 3, 8, new int[]{1, 2, 6, 8, 7}) == 2);
        System.out.println(solution(4, 10, 20, new int[]{12, 15, 18, 9}) == 2);
        System.out.println(solution(3, 1, 10, new int[]{2, 4, 6}) == 3);
        System.out.println("push test");
        System.out.println("pull test");
    }
}
