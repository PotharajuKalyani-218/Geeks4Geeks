import java.lang.Math;
class Solution {
    int maxProduct(int[] arr) {
        int mxp=arr[0];
        int mnp=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                int t=mxp;
                mxp=mnp;
                mnp=t;
            }
            mxp=Math.max(arr[i],arr[i]*mxp);
            mnp=Math.min(arr[i],arr[i]*mnp);
            res=Math.max(res,mxp);
        }
        return res;

    }
}