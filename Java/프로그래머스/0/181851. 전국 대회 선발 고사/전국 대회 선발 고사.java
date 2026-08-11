import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> students = new ArrayList<>();

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                students.add(i);
            }
        }

        students.sort((a, b) -> rank[a] - rank[b]);

        int a = students.get(0);
        int b = students.get(1);
        int c = students.get(2);

        return 10000 * a + 100 * b + c;
    }
}