// Time : O(m * n) m, n is number of nodes in 'T' and 'S'.
// Space : O(n).
// O(n) Solution - https://www.cdn.geeksforgeeks.org/check-binary-tree-subtree-another-binary-tree-set-2/

package Tree;
public class check_if_subtree {
    static boolean isIdentical(Node T, Node S) {
        if(T == null && S == null) return true;
        if(T == null || S == null) return false;
        return (T.data == S.data && isIdentical(T.left, S.left) 
                    && isIdentical(T.right, S.right));
    }
    public static boolean isSubtree(Node T, Node S) {
        if(T == null) return false;
        if(S == null) return true;
        
        if(isIdentical(T, S)) return true;
        return isSubtree(T.left, S) || isSubtree(T.right, S);
    }
}
