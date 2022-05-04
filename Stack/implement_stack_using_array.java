package Stack;

public class implement_stack_using_array {
    int top;
	int arr[] = new int[1000];

    implement_stack_using_array() {
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a) {
        arr[++top] = a;
	} 
	
    //Function to remove an item from top of the stack.
	int pop() {
	    if(top < 0)
	        return -1;
	    return arr[top--];
	}
}
