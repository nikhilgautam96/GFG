// Time : O(n), Space : O(H).
package Tree;
import java.util.*;
public class vetical_width_of_a_binary_tree {
    static int min, max;
    static void traverse(Node root, int level) {
        if(root == null)
            return;
        if(level < min)
            min = level;
        if(level > max)
            max = level;
        traverse(root.left, level-1);
        traverse(root.right, level+1);
    }
    public static int verticalWidth(Node root) {
        if(root == null) return 0;
        min = max = 0;
        traverse(root, 0);
        return max - min + 1;
	}

    // Method 2 : Using HashMap
    // public static HashSet<Integer> s = new HashSet<Integer>();
    // vetical_width_of_a_binary_tree(){
    //     s.clear();
    // }
    // public static void find(Node root,int l) {
    //     // base case
    //     if(root==null)
    //         return;
    //     // add the distance to set
    //     s.add(l);
    //     // recurse for left and right subtrees
    //     find(root.left,l-1);
    //     find(root.right,l+1);
    // }
	// public static int verticalWidth(Node root) {
	//     if(root==null)
	//     return 0;
	//     find(root,0);
	//     return s.size();
	// }
}
