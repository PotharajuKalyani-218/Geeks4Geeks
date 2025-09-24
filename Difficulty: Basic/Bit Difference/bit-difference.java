class Solution {
    public static int countBitsFlip(int a, int b) {
        int c=0;
        int n=a^b;
        while(n!=0)
        {
            n=(n&(n-1));
            c++;
        }
        return c;
        


    }
}
