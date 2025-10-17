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
    public int lengthOfLoop(Node head) {
        if(head==null || head.next==null) return 0;
        int c=0;
        Node s,f;
        s=f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                c=1;
                s=s.next;
            while(s!=f){
                c++;
                s=s.next;
            }
            break;
            }
        }
        return c;
    }
}