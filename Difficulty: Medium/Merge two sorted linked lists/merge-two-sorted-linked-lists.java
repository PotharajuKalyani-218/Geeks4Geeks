/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node l1, Node l2) {
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