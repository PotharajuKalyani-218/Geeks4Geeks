class Solution {
    static String decToBinary(int n) {
        String res="";
        while(n>0)
        {
            int r=n%2;
            res=r+res;
            n=n/2;
            
        }
        return res;

    }
}