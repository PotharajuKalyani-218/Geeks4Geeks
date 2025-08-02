import java.util.*;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;
        int prefixSum = 0;

        // Map: prefixSum → first index it was seen
        Map<Integer, Integer> firstSeen = new HashMap<>();

        for (int i = 0; i < n; i++) {
            // Transform array values into +1 / -1
            if (arr[i] > k)
                prefixSum += 1;
            else
                prefixSum -= 1;

            // If prefixSum > 0, whole subarray [0...i] is valid
            if (prefixSum > 0)
                maxLen = i + 1;

            // If prefixSum has been seen before, check subarray
            if (firstSeen.containsKey(prefixSum - 1)) {
                maxLen = Math.max(maxLen, i - firstSeen.get(prefixSum - 1));
            }

            // Store only the first occurrence of prefixSum
            firstSeen.putIfAbsent(prefixSum, i);
        }

        return maxLen;
    }
}
