class Solution {
    int missingNum(int arr[]) {
        int n=arr.length+1;
        long sum=(long)n*(n+1)/2;
        long total=0;
        for(int i=0;i<n-1;i++){
            total+=arr[i];
        }
        int res= (int) (sum-total);
        return res;


    }
}