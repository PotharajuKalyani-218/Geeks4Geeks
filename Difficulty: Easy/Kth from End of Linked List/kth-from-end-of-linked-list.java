/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        if(head==null)
            return -1;
        Node slow,fast;
        slow=fast=head;
        for(int i=0;i<k;i++){
            if(fast!=null) fast=fast.next;
            else return -1;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data;
            
        

    }
}