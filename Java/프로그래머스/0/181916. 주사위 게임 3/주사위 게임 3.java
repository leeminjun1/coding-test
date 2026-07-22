import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        // 네 숫자가 모두 같을 때
        if (dice[0] == dice[3]) {
            return 1111 * dice[0];
        }

        // 세 숫자가 같을 때
        if (dice[0] == dice[2]) {
            int p = dice[0];
            int q = dice[3];

            return (10 * p + q) * (10 * p + q);
        }

        if (dice[1] == dice[3]) {
            int p = dice[1];
            int q = dice[0];

            return (10 * p + q) * (10 * p + q);
        }

        // 두 숫자씩 같은 값이 나올 때
        if (dice[0] == dice[1] && dice[2] == dice[3]) {
            int p = dice[0];
            int q = dice[2];

            return (p + q) * Math.abs(p - q);
        }

        // 두 숫자만 같을 때
        if (dice[0] == dice[1]) {
            return dice[2] * dice[3];
        }

        if (dice[1] == dice[2]) {
            return dice[0] * dice[3];
        }

        if (dice[2] == dice[3]) {
            return dice[0] * dice[1];
        }

        // 네 숫자가 모두 다를 때
        return dice[0];
    }
}