// "Given a rope of length n find max number of pieces we can make such that length of 
        // every piece is in set {a,b,c} for given length a, b, c"
public class max_pieces_of_a_rope {
    public static int maxCut(int ropeLen, int a, int b, int c) {
        if(ropeLen == 0) {
            return 0;
        }
        if(ropeLen < 0) {
            return -1;
        }
        int res = Math.max(Math.max(maxCut(ropeLen - a, a, b, c), 
                            maxCut(ropeLen - b, a, b, c)), maxCut(ropeLen - c, a, b, c));
                
        if(res == -1)
            return -1;
        return res + 1;
    }
}
