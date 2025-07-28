class Solution {
    public static int balanceSums(int[][] mat) {
        int n = mat.length;

        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        int maxSum = 0;

        // Step 1: Calculate row sums and column sums
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }

        // Step 2: Find maximum sum among all row and column sums
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, rowSum[i]);
            maxSum = Math.max(maxSum, colSum[i]);
        }

        // Step 3: Apply operations to make matrix beautiful
        int i = 0, j = 0, operations = 0;
        while (i < n && j < n) {
            int diff = Math.min(maxSum - rowSum[i], maxSum - colSum[j]);
            mat[i][j] += diff;
            rowSum[i] += diff;
            colSum[j] += diff;
            operations += diff;

            // Move to next row or column when maxSum reached
            if (rowSum[i] == maxSum) i++;
            if (colSum[j] == maxSum) j++;
        }

        return operations;
    }
}
