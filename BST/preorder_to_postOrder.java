// Below code builds a BST using the preorder traversal.
// Time : O(n).
package BST;
public class preorder_to_postOrder {
    static int i;
    static Node postUtil(int pre[], int min, int max) {
        if(i >= pre.length)
            return null;
        Node temp = null;
        if(pre[i] > min && pre[i] < max) {
            temp = new Node(pre[i]);
            i += 1;
            if(i < pre.length)
                temp.left = postUtil(pre, min, temp.data);
            if(i < pre.length)
                temp.right = postUtil(pre, temp.data, max);
        }
        return temp;
    }
    public static Node post_order(int pre[], int size) {
        i = 0;
        return postUtil(pre, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
