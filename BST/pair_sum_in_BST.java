// Time : O(n), Space : O(n) or Theta(n) in Method 2.
package BST;
import java.util.*;
public class pair_sum_in_BST {
    // Method 1 : Hashing approach.
    static HashSet<Integer> hs;
    static boolean findpairUtil(Node root, int sum) {
        if(root == null)
            return false;
        if(findpairUtil(root.left, sum) == true)
            return true;
        if(hs.contains(sum - root.data) == true) {
            return true;
        } 
        else
            hs.add(root.data);
        return findpairUtil(root.right, sum);
    }
    static boolean findPair(Node root, int X) {
        hs = new HashSet<>();
        return findpairUtil(root, X);
    }

    // Method 2 : two pointer approach.
    // static int count = 0;
    // public static void inorder(Node root, int a[]) {
    //     if(root == null) {
    //         return;
    //     }
    //     inorder(root.left, a);
    //     a[count++] = root.data;
    //     inorder(root.right, a);
    // }
    // static boolean findPair(Node root, int sum) {
    //     int a[] = new int[100001];
    //     count = 0;
    //     if(root == null || (root.left == null && root.right == null)) {
    //         return false;
    //     }
    //     inorder(root, a);
    //     int left = 0, right = count-1;
    //     while(left < right) {
    //         if(a[left] + a[right] == sum) {
    //             return true;
    //         }else if(a[left] + a[right] < sum) {
    //             left++;
    //         }else {
    //             right--;
    //         }
    //     }
    //     return false;
    // }

    // Method 3 : two pointer on BST approach.
    // static boolean existsPair(node root, int x) {
    //     // Iterators for BST
    //     Stack<node > it1 = new Stack<node>(), it2 = new Stack<node>();

    //     // Initializing forward iterator
    //     node c = root;
    //     while (c != null) {
    //         it1.push(c);
    //         c = c.left;
    //     }
    
    //     // Initializing backward iterator
    //     c = root;
    //     while (c != null) {
    //         it2.push(c);
    //         c = c.right;
    //     }
            
    //     // Two pointer technique
    //     while (it1.peek() != it2.peek()) {
    
    //         // Variables to store values at
    //         // it1 and it2
    //         int v1 = it1.peek().data, v2 = it2.peek().data;
    
    //         // Base case
    //         if (v1 + v2 == x)
    //             return true;
    
    //         // Moving forward pointer
    //         if (v1 + v2 < x) {
    //             c = it1.peek().right;
    //             it1.pop();
    //             while (c != null) {
    //                 it1.push(c);
    //                 c = c.left;
    //             }
    //         }
    
    //         // Moving backward pointer
    //         else {
    //             c = it2.peek().left;
    //             it2.pop();
    //             while (c != null) {
    //                 it2.push(c);
    //                 c = c.right;
    //             }
    //         }
    //     }
        
    //     // Case when no pair is found
    //     return false;
    // }
}
