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
    Node reverseList(Node head) {
                Node prev=null;
                Node curr=head;
            Node temp;
while(curr!=null){
temp=curr.next;
curr.next=prev;
prev=curr;
curr=temp;
}
return prev;



    }
}