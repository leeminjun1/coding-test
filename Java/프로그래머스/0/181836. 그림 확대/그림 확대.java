class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int index = 0;

        for (String line : picture) {
            StringBuilder enlarged = new StringBuilder();

            for (char c : line.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    enlarged.append(c);
                }
            }

            for (int i = 0; i < k; i++) {
                answer[index++] = enlarged.toString();
            }
        }

        return answer;
    }
}