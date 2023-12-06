package String;
public class leftmost_repeating_char {
    static int repeatedCharacter(String S) {
        boolean visited[] = new boolean[256];
        int ans = -1;
        for(int i = S.length()-1; i>=0; i--) {
            if(visited[S.charAt(i)] == true) {
                ans = i;
            }
            visited[S.charAt(i)] = true;
        }
        return ans;
    }
}
