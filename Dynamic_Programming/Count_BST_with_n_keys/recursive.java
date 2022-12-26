// Time : O()
package Dynamic_Programming.Count_BST_with_n_keys;
public class recursive {
    static int countBST(int n) {
        if(n == 0 || n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 5;

        int sum = 0;
        for(int i = 1; i<=n; i++) {
            sum += countBST(n-i) * countBST(i-1);
        }
        return sum;
    }
    public static void main(String args[]) {
        System.out.println(recursive.countBST(5));
    }
}
