class Solution {
    public String[] solution(String[] names) {
        int size = (names.length + 4) / 5;
        String[] answer = new String[size];

        int index = 0;

        for (int i = 0; i < names.length; i += 5) {
            answer[index] = names[i];
            index++;
        }

        return answer;
    }
}