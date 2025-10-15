// User function Template for Java

/*class Node
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
    public static Node partition(Node head, int x) {
        Node p=new Node(0);
        Node q=new Node(0);
        Node r=new Node(0);
        Node np=p;
        Node nq=q;
        Node nr=r;
        while(head!=null){
            if(head.data< x){
                np.next=head;
                np=np.next;
            }
             if(head.data==x)
            {
                nq.next=head;
                nq=nq.next;
            }
            if(head.data>x) 
            {
                nr.next=head;
                nr=nr.next;
            }

            head=head.next;
        }
        np.next=q.next;
        nq.next=r.next;
        nr.next=null;
        return p.next;
        }
}