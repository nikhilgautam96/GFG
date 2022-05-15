// Time : O(n), Space : O(H)
package BST;
import java.util.*;
public class print_bst_elements_in_given_range {
    static ArrayList<Integer> ans;
    // Method 1 : simple inorder traversal.
    // public static void find(Node root, int low, int high) {
    //     if(root == null) {
    //         return;
    //     }
    //     find(root.left, ans, low, high);
    //     if(root.data >= low && root.data <= high) {
    //         ans.add(root.data);
    //     }
    //     find(root.right, ans, low, high);
    // }
    // Method 2 : restrictred inorder traversal.
    static void find(Node root, int low, int high) {
        if(root == null)
            return;
        if(root.data > low)
            find(root.left, low, high);
        if(root.data >= low && root.data <= high)
            ans.add(root.data);
        if(root.data < high)
            find(root.right, low, high);
    }
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
	    ans = new ArrayList<>();
	    find(root, low, high);
	    return ans;
    }
}
