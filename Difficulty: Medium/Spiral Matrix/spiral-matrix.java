// User function Template for Java

class Solution {

    public int findK(int a[][], int n, int m, int k) {
                List<Integer> result=new ArrayList<>();
        //int n=matrix.length;
        //int m=matrix[0].length;
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=m-1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                result.add(a[top][i]);
            }
            top++;
             for(int i=top;i<=bottom;i++)
            {
                result.add(a[i][right]);
            }
            right--;
            if(top<=bottom){
             for(int i=right;i>=left;i--)
            {
                result.add(a[bottom][i]);
            }
        }
        bottom--;
        if(left<=right){
             for(int i=bottom;i>=top;i--)
            {
                result.add(a[i][left]);
            }
        }
        left++;


        }
        return result.get(k-1);
        
    }
}
    