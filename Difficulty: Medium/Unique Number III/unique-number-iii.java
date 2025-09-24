// User function Template for Java

class Solution {
    public int getSingle(int[] arr) {
        int a=0;
        int b=0;
        for(int num:arr)
        {
            a^=(num&(~b));
            b^=(num&(~a));
        }
        return a;
        
        
    }
}