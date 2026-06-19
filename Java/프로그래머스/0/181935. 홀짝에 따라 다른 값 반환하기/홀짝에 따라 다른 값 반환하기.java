class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 2 == 1) {
            // n이 홀수면 n 이하의 홀수들의 합
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        } else {
            // n이 짝수면 n 이하의 짝수들의 제곱의 합
            for (int i = 2; i <= n; i += 2) {
                answer += i * i;
            }
        }
        
        return answer;
    }
}