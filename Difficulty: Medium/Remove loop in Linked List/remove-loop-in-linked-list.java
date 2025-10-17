/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        HashSet <Node> set=new HashSet<>();
        Node p=head;
        while(p!=null){
            if(set.contains(p.next)){
                p.next=null;
                break;
            }
            set.add(p);
            p=p.next;
        }
    }
}