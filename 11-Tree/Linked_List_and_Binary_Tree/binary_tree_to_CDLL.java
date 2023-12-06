// Time : O(n)
package Tree.Linked_List_and_Binary_Tree;
public class binary_tree_to_CDLL {
    Node head, prev, tail;
    void convert(Node root) {
        if(root == null)
            return;
        convert(root.left);
        if(prev == null) {
            head = root;
        }else {
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        tail = root; // the last time tail is assigned to any node is the tail node.
        convert(root.right);
    }
    Node bTreeToClist(Node root) {
        head = prev = tail = null;
        convert(root);
        head.left = tail;
        tail.right = head;
        return head;
    }
}
