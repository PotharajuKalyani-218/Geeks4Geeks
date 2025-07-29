// User function Template for Java

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> asciirange(String s) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = s.length();

        // Use a boolean array to avoid recomputation
        boolean[] visited = new boolean[26]; // 'a' to 'z'

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (!visited[idx]) {
                visited[idx] = true;

                int first = s.indexOf(ch);
                int last = s.lastIndexOf(ch);

                if (first != last) {
                    int sum = 0;
                    for (int j = first + 1; j < last; j++) {
                        sum += (int) s.charAt(j);
                    }
                    if (sum > 0) {
                        result.add(sum);
                    }
                }
            }
        }

        return result;
    }
}
