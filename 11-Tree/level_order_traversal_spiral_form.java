package Tree;
import java.util.*;
public class level_order_traversal_spiral_form {
    // Method 3 : Using "Dequeue".
    public static void spiralPrint(Node root){
        //Declare a deque
        Deque<Node> dq = new ArrayDeque<>();
        //Insert the root of the tree into the deque
        dq.offer(root);
        //Create a  variable that will switch in each iteration
        boolean reverse = true;
        //Start iteration
        while (!dq.isEmpty()){
              //Save the size of the deque here itself, as in further steps the size
              //of deque will frequently change
            int n = dq.size();
              //If we are printing left to right
            if(!reverse){
              //Iterate from left to right
                for (int i =0; i < n; i++){
                  //Insert the child from the back of the deque
                  //Left child first
                    if (dq.peekFirst().left  != null)
                        dq.offerLast(dq.peekFirst().left);
                    if (dq.peekFirst().right != null)
                        dq.offerLast(dq.peekFirst().right);
                  //Print the current processed element
                    System.out.print(dq.pollFirst().key + "  ");
                }
                //Switch reverse for next traversal
                reverse = !reverse;
            }else{
              //If we are printing right to left
              //Iterate the deque in reverse order and insert the children 
              //from the front
                while (n-- >0){
                    //Insert the child in the front of the deque
                    //Right child first
                    if (dq.peekLast().right != null)
                        dq.offerFirst(dq.peekLast().right);
                  
                    if (dq.peekLast().left != null)
                        dq.offerFirst(dq.peekLast().left);

                  //Print the current processed element
                    System.out.print(dq.pollLast().key + "  ");
                }
                //Switch reverse for next traversal
                reverse = !reverse;
            }
        }
    }
    // Method 1 : Using the Queue as usual and a stack to store next level in reverse order.
    // Method 2 : Using "2-Stacks".
    ArrayList<Integer> findSpiral(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()) {
            while(!s1.isEmpty()) {
                Node temp = s1.pop();
                ans.add(temp.data);
                if(temp.right != null) {
                    s2.push(temp.right);
                }
                if(temp.left != null) {
                    s2.push(temp.left);
                }
            }
            while(!s2.isEmpty()) {
                Node temp = s2.pop();
                ans.add(temp.data);
                if(temp.left != null) {
                    s1.push(temp.left);
                }
                if(temp.right != null) {
                    s1.push(temp.right);
                }
            }
        }
        return ans;
    }
}
