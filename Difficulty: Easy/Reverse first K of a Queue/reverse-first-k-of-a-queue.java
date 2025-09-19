class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        int n=q.size();
        if(q==null || k<=0 || k>q.size())
            return q;
        int res[]=new int[k];

        for(int i=0;i<k;i++)
        {
            res[i]=q.poll();
        }
        for(int i=k-1;i>=0;i--)
        {
            q.offer(res[i]);
        }
        for(int i=0;i<(n-k);i++)
        {
            q.offer(q.poll());
        }
        return q;

        
    

    }
}