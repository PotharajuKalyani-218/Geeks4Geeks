/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        Node fast=head;
        Node slow=head;
        if(head==null)
            return new Node(x);
    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }

   Node r=new Node(x);
    r.next=slow.next;
    slow.next=r;
    return head;

    
        


    }
}