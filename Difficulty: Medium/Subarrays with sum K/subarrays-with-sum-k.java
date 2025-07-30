import java.util.HashMap;

class Solution {
    public int cntSubarrays(int[] arr, int k) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        int sum = 0;
        int count = 0;

        // Initial condition for sum = k at index 0
        prefixSumCount.put(0, 1);

        for (int num : arr) {
            sum += num;

            // Check if (sum - k) occurred before
            if (prefixSumCount.containsKey(sum - k)) {
                count += prefixSumCount.get(sum - k);
            }

            // Store current prefix sum
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
