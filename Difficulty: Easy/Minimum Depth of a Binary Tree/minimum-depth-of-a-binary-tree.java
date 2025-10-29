/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    int minDepth(Node root) {
        if(root==null) return 0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int d=1;
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                Node curr=q.poll();
                if(curr.left==null && curr.right==null)
                    return d;
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            d++;
        }
        return d;
        

    }
}