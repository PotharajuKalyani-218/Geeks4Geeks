import java.lang.Math;
class Solution {
    int maxSubarraySum(int[] arr) {
        int cs=0;
        int mx=arr[0];
        for(int n:arr){
            cs=cs+n;
            mx=Math.max(mx,cs);
            if(cs<0)
            cs=0;
        }
        return mx;

    }
}
