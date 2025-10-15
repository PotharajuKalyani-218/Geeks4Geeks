/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        if(head==null || head.next==null) return head;
        Node p=new Node(0);
        p.next=head;
        Node q=p;
        while(q.next!=null && q.next.next!=null){
        Node f=q.next;
        Node s=q.next.next;
        f.next=s.next;
        s.next=f;
        q.next=s;
        q=f;
        }
        return p.next;
    }
}