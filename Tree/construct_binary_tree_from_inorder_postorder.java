// Time : O(n), Space : O(H) - recursion stack.
package Tree;
import java.util.HashMap;
public class construct_binary_tree_from_inorder_postorder {
    Node build(int in[], int post[], int is, int ie, int ps, int pe, HashMap<Integer, Integer> hm) {
        if(ps > pe || is > ie)
            return null;
        Node temp = new Node(post[pe]);
        int inIdx = hm.get(post[pe]);
        int numLeft = inIdx - is;
        temp.left = build(in, post, is, inIdx - 1, ps, ps + numLeft - 1, hm);
        temp.right = build(in, post, inIdx + 1, ie, ps + numLeft, pe - 1, hm);
        
        return temp;
    }
    Node buildTree(int in[], int post[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<n; i++) {
            hm.put(in[i], i);
        }
        Node root = build(in, post, 0, n-1, 0, n-1, hm);
        return root;
    }

    // Time : O(n^2) approach.
    // public static void connect(Node root, Node temp, HashMap<Integer, Integer> hm) {
    //     if(root == null) {
    //         return;
    //     }
    //     int tempi = hm.get(temp.data);
    //     int rooti = hm.get(root.data);
    //     if(tempi > rooti) {
    //         // this means temp belongs to right subtree.
    //         if(root.right == null) {
    //             // we can attach the temp node here.
    //             root.right = temp;
    //             return;
    //         }
    //         connect(root.right, temp, hm);
    //     }else {
    //         // this means temp belongs to left subtree.
    //         if(root.left == null) {
    //             // we can attach the temp node here.
    //             root.left = temp;
    //             return;
    //         }
    //         connect(root.left, temp, hm);
    //     }
    // }
    // Node buildTree(int in[], int post[], int n) {
    //     // we first store the index of each element of in[] array,
    //     // to make efficient search while creating the tree using the post[] array
    //     HashMap<Integer, Integer> hm = new HashMap<>();
    //     for(int i = 0; i<n; i++) {
    //         hm.put(in[i], i);
    //     }
    //     // The last node of postorder traversal is always the root of entire tree.
    //     Node head = new Node(post[n-1]);
    //     for(int i = n-2; i>=0; i--) {
    //         Node temp = new Node(post[i]);
    //         connect(head, temp, hm);
    //     }
    //     return head;
    // }
}
