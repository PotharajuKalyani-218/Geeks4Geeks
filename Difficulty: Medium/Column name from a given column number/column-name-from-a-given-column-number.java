// User function Template for Java

class Solution {
    String colName(long n) {
        StringBuilder res=new StringBuilder();
        while(n!=0)
        {
            n--;
            long r=n%26;
            n=n/26;
            res.append((char)('A'+r));

        }
        return res.reverse().toString();
        
    }
}