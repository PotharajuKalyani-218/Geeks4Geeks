/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] A) {
        if(A.length==0)
            return null;
        int c=1;
        while(c<A.length){
            for(int i=0;i<A.length-c;i+=c*2){
                A[i]=mergeList(A[i],A[i+c]);
            }
            c*=2;
        }
        return A[0];
        
    }
        public Node mergeList(Node l1, Node l2) {
            Node p=new Node(0);
            Node q=p;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data)
            {
                q.next=l1;
                l1=l1.next;
            }
            else
            {
                q.next=l2;
                l2=l2.next;
            }
            q=q.next;
        }
        if(l1!=null )
            q.next=l1;
        else
            q.next=l2;
        return p.next;
    }
}