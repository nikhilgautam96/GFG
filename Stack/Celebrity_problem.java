package Stack;
import java.util.Stack;
public class Celebrity_problem {
    int celebrity(int M[][], int n) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n; i++) {
            st.push(i);
        }
        while(st.size() > 1) {
            int a = st.pop(), b = st.pop();
            if(M[a][b] == 1) {
                // 'a' is not a celeb.
                st.push(b);
            }else if(M[b][a] == 1) {
                // 'b' is not a celeb.
                st.push(a);
            }
        }
        int potentialCeleb = st.pop();
        for(int j = 0; j<n; j++){
            if(M[potentialCeleb][j] == 1 || 
                    (j != potentialCeleb && M[j][potentialCeleb] == 0))
                return -1;
        }
        return potentialCeleb;
    }
}
