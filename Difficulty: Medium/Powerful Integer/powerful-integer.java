import java.util.*;

class Solution {
    public int powerfulInteger(int[][] intervals, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (var interval : intervals) {
            map.merge(interval[0], 1, Integer::sum);
            map.merge(interval[1] + 1, -1, Integer::sum);
        }

        int currentCount = 0;
        int result = -1;
        int lastPoint = -1;

        for (var entry : map.entrySet()) {
            int point = entry.getKey();

            if (currentCount >= k && lastPoint != -1) {
                result = point - 1;
            }

            currentCount += entry.getValue();
            lastPoint = point;
        }

        return result;
    }
}
