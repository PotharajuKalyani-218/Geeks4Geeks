/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        if(x==1)
            return head=head.next;
        Node p=head;
        int c=1;
        while(c<(x-1)){
            p=p.next;
            c++;
        }
        p.next=p.next.next;
        return head;


    }
}