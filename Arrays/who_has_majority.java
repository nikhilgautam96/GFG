public class who_has_majority {
    public int majorityWins(int arr[], int n, int x, int y) {
        int xc = 0, yc = 0;
        for(int i = 0; i<n; i++) {
            if(arr[i] == x) xc++;
            if(arr[i] == y) yc++;
        }
        if(xc == yc) {
            if(x < y) return x;
            return y;
        }
        else if(xc > yc) {
            return x;
        }
        return y;
    }
}
