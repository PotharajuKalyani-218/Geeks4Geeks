class Solution {
    int stockBuySell(int arr[]) {
        int p=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]<arr[i])
            p+=(arr[i]-arr[i-1]);
        }
        return p;

    }
}
