// Time : O(n * n), Space : O (n * n).
package Graph.GFG_Problems;
import java.util.*;
public class Steps_by_Knight {
    class pos {
        int i, j, dis;
        pos(int x, int y, int d) {
            i = x; j = y; dis = d;
        }
    }
    public static boolean isValid(int i, int j, int n) {
        return (i>=1 && i<=n && j>=1 && j<=n);
    }
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N) {
        int x[] = new int[] {-1, -1, 1, 1, -2, -2, 2, 2};
        int y[] = new int[] {-2, 2, -2, 2, -1, 1, -1, 1};
        Queue<pos> q = new LinkedList<>();
        q.add(new pos(KnightPos[0], KnightPos[1], 0));
        boolean v[][] = new boolean[N+1][N+1];
        v[KnightPos[0]][KnightPos[1]] = true;
        while(!q.isEmpty()) {
            pos temp = q.poll();
            if(temp.i == TargetPos[0] && temp.j == TargetPos[1]) return temp.dis;
            
            for(int k = 0; k<8; k++) {
                int newi = temp.i + x[k];
                int newj = temp.j + y[k];
                if(isValid(newi, newj, N) && !v[newi][newj]) {
                    q.add(new pos(newi, newj, temp.dis + 1));
                    v[newi][newj] = true;
                }
            }
        }
        return -1;
    }
}
