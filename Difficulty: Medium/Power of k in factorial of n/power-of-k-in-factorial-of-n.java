
class Solution {
    public int maxKPower(int n, int k) {
        if (k <= 1) return Integer.MAX_VALUE; // Edge case

        int result = Integer.MAX_VALUE;
        int num = k;

        for (int p = 2; p * p <= num; p++) {
            if (num % p == 0) {
                int count = 0;
                while (num % p == 0) {
                    count++;
                    num /= p;
                }
                int temp = countPowerInFactorial(n, p) / count;
                result = Math.min(result, temp);
            }
        }

        if (num > 1) {
            int temp = countPowerInFactorial(n, num);
            result = Math.min(result, temp);
        }

        return result;
    }

    private int countPowerInFactorial(int n, int p) {
        int count = 0;
        while (n > 0) {
            n /= p;
            count += n;
        }
        return count;
    }
}
