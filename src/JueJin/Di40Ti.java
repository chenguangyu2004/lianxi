package JueJin;

public class Di40Ti {
    public static String solution(String dna_sequence) {
        int n = dna_sequence.length();
        if (n == 0) {
            return "";
        }

        int i = 0, j = 1, k = 0;
        while (i < n && j < n && k < n) {
            char a = dna_sequence.charAt((i + k) % n);
            char b = dna_sequence.charAt((j + k) % n);

            if (a == b) {
                k++;
            } else {
                if (a > b) {
                    i += k + 1;
                } else {
                    j += k + 1;
                }

                if (i == j) {
                    j++;
                }

                k = 0;
            }
        }

        int start;
        if (i >= n) {
            start = j;
        } else if (j >= n) {
            start = i;
        } else {
            start = Math.min(i, j);
        }

        start %= n; // Ensure start is within bounds, handles cases where start might be n (mod n becomes 0)
        return dna_sequence.substring(start) + dna_sequence.substring(0, start);
    }

    public static void main(String[] args) {
        System.out.println(solution("ATCA").equals("AATC"));
        System.out.println(solution("CGAGTC").equals("AGTCCG"));
        System.out.println(solution("TCATGGAGTGCTCCTGGAGGCTGAGTCCATCTCCAGTAG").equals("AGGCTGAGTCCATCTCCAGTAGTCATGGAGTGCTCCTGG"));
    }
}
