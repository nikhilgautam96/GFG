// Time : O(3 ^ n), Space : O(n) for recursion stack.
package Dynamic_Programming.Maximum_Cuts;
public class recursive {
    int maxCuts(int n, int a, int b, int c) {
        if(n < 0)
            return -1;
        // if the rod length 'n' is = '0' then no cuts can be made so 'return 0'. 
        if(n == 0)
            return 0;
        int res = Math.max(maxCuts(n-a,a,b,c), Math.max(maxCuts(n-b,a,b,c), maxCuts(n-c,a,b,c)));
        if(res == -1)
            return res;
        // if there is a solution we add 1 for current cut made to maximum cuts 
        // returned from recursive call.
        return (res + 1);
    }
}
