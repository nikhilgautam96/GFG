package Tree;
public class contruct_binary_tree_from_parent_array {
    public static Node createTree(int parent[], int N) {
        Node head = null;
        Node created[] = new Node[N];
        for(int i = 0; i<N; i++) {
            created[i] = new Node(i);
        }
        for(int i = 0; i<N; i++) {
            if(parent[i] == -1) {
                head = created[i];
            }else {
                Node p = created[parent[i]];
                if(p.left == null)
                    p.left = created[i];
                else
                    p.right = created[i];
            }
        }
        return head;
    }
}
