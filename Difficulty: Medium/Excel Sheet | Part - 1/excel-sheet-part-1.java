// User function Template for Java

class Solution {
    public String excelColumn(int N) {

        StringBuilder res=new StringBuilder();
        while(N!=0)
        {
            N--;
            int r=N%26;
            N=N/26;
            res.append((char)('A'+r));

        }
        return res.reverse().toString();
        
    }
}