// Time : O(n)
package Tree.Linked_List_and_Binary_Tree;
class Node{ int data; Node left, right; Node(int d){ data=d; left=right=null; }}
public class binary_tree_to_DLL {
    Node head, prev;
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
        convert(root.right);
    }
    Node bToDLL(Node root) {
        head = prev = null;
        convert(root);
        return head;
    }
}
