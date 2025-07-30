class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
            ArrayList<Integer> rows=new ArrayList<>();
            int m=1;
            for(int j=0;j<n;j++)
            {
                rows.add(m);
                m=m*(n-j-1)/(j+1);
            }

        return rows;


    }
}