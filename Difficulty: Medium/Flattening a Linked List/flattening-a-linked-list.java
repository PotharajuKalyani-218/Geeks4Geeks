/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/    

class Solution
{
    // Function to flatten a linked list
    Node flatten(Node root)
    {
        // Base case
        if (root == null || root.next == null)
            return root;

        // Recursively flatten the next list
        root.next = flatten(root.next);

        // Merge current list with next flattened list
        root = merge(root, root.next);

        return root;
    }

    // Merge two sorted linked lists using bottom pointer
    Node merge(Node a, Node b)
    {
        if (a == null) return b;
        if (b == null) return a;

        Node result;

        if (a.data < b.data)
        {
            result = a;
            result.bottom = merge(a.bottom, b);
        }
        else
        {
            result = b;
            result.bottom = merge(a, b.bottom);
        }

        result.next = null; // important for GFG
        return result;
    }
}
