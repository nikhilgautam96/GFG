// Time : O(n), Space : O(n).
package BST;
import java.util.*;
public class convert_level_order_to_BST {
    class NodeDetails {
        Node node; int min, max;
        NodeDetails(Node node, int min, int max) {
            this.node = node; this.min = min; this.max = max;
        }
    }
    public Node constructBST(int[] arr) {
        int n = arr.length;
        Node root = new Node(arr[0]);
        Queue<NodeDetails> q = new LinkedList<>();
        q.add(new NodeDetails(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        int i = 1;
        while(!q.isEmpty()) {
            NodeDetails temp = q.poll();
            if(i < n && arr[i] < temp.node.data && arr[i] > temp.min) {
                temp.node.left = new Node(arr[i]);
                q.add(new NodeDetails(temp.node.left, temp.min, temp.node.data));
                i++;
            }
            if(i < n && arr[i] > temp.node.data && arr[i] < temp.max) {
                temp.node.right = new Node(arr[i]);
                q.add(new NodeDetails(temp.node.right, temp.node.data, temp.max));
                i++;
            }
        }
        return root;
    }
}
