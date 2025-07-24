class Solution {
    static long nthFaithfulNum(int n) {
        long pow = 1;
        long ans = 0;
        
        while (n > 0) {
            if ((n & 1) == 1) {
                ans += pow;
            }
            pow *= 7;
            n = n / 2;
        }
        
        return ans;
    }
}
