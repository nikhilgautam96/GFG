package Stack;
public class implement_stack_using_linked_list {
    class StackNode {
        int data;
        StackNode next;
        StackNode(int a) {
            data = a;
            next = null;
        }
    }   
    StackNode top;
    //Function to push an integer into the stack.
    void push(int a) {
        StackNode node = new StackNode(a);
        if(top != null)
            node.next = top;
        top = node;
    }
    //Function to remove an item from top of the stack.
    int pop() {
        if(top == null)
            return -1;
        StackNode temp = top;
        top = top.next;
        temp.next = null;
        return temp.data;
    }
}
