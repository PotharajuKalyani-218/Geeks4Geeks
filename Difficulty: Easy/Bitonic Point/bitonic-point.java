// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        int n=arr.length;
        int p=0;
        while(p<=n-2 && arr[p]<arr[p+1])
        {
            p++;
            
        }
        int q=p;
        while(q<n-1 && arr[q]<arr[q+1]){
            q++;
        }
        return arr[p];
        
        
    }
}