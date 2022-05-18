// Time : O(n), Space : O(H).
package BST;
public class fixing_2_nodes_of_BST {
    // Method 1 : using Auxulary array.
        // arr[] = inorder(root);  "the array will have sorted tree."
        // traverse the array to get the "first" ans "second" nodes and swap them.
        // To get the "first" and "second" nodes using the same techninque as used 
        // in tree aopproach below.

    // Method 2 : without using extra space.
    Node first, second, prev;
    void correctBstUtil(Node root) {
        if(root == null)
            return;
        correctBstUtil(root.left);
        if(prev != null && root.data < prev.data) {
            if(first == null) first = prev;
            second = root;
        }
        prev = root;
        correctBstUtil(root.right);
    }
    public Node correctBST(Node root) {
        first = second = prev = null;
        if(root == null) return root;
        correctBstUtil(root);
        int temp = first.data;
        first.data = second.data;
        second.data = temp;
        return root;
    }
}
