// Time: O(H), Space : O(H)
package BST;
public class minimum_element_in_BST {
    int minValue(Node node) {
        if(node == null)
            return -1;
        return (node.left != null) ? minValue(node.left) : node.data;
    }
}
