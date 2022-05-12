package Tree;
import java.util.*;
public class maximum_width_of_a_binary_tree {
    int getMaxWidth(Node root) {
        if(root == null) return 0;
        int maxWidth = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int width = q.size();
            maxWidth = Math.max(width, maxWidth);
            while(width-- > 0) {
                Node temp = q.poll();
                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null) 
                    q.add(temp.right);
            }
        }
        return maxWidth;
    }
}
