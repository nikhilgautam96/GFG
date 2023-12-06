package Stack;
import java.util.Stack;
public class delete_mid_element_of_a_stack {
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        int mid = (sizeOfStack + 1)/2;
        if(s.size() == mid) {
            s.pop();
            return;
        }
        int push_back = s.pop();
        deleteMid(s, sizeOfStack);
        s.push(push_back);
    }
}
