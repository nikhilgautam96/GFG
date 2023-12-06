package BST;
public class find_closest_element_in_BST {
    static int minDiff(Node  root, int K) { 
        if(root == null)
            return K;
        if(root.data == K)
            return 0;
        if(K < root.data)
            return Math.min(Math.abs(root.data - K), minDiff(root.left, K));
        return Math.min(Math.abs(root.data - K), minDiff(root.right, K));
    }
}
