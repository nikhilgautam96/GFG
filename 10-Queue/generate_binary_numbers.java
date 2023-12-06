// Time : O(n), Space : O(n * Log (n)) 
package Queue;
import java.util.*;
public class generate_binary_numbers {
    static ArrayList<String> generate(int N) {
        ArrayList<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(N-- > 0) {
            String temp = q.poll();
            ans.add(temp);
            q.add(temp + "0");
            q.add(temp + "1");
        }
        return ans;
    }
}
