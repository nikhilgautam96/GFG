package Tree;
public class height_of_binary_tree {
    int height(Node node) {
        if(node != null) {
            return 1 + Math.max(height(node.left), height(node.right));
        }
        return 0;
    }
}
