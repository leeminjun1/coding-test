class Solution {
    public int solution(String myString, String pat) {
        StringBuilder changed = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                changed.append('B');
            } else {
                changed.append('A');
            }
        }

        return changed.toString().contains(pat) ? 1 : 0;
    }
}