package Greedy.Problems;
class MinHeapNode {
    char data;
    int freq;
    MinHeapNode left, right, top;
    MinHeapNode(char c, int freq) {
        left = right = null;
        this.data = c;
        this.freq = freq;
    }
}
public class Huffman_Decoding {
    static String decodeHuffmanData(MinHeapNode root, String binaryString) {
        String ans = "";
        MinHeapNode cur = root;
        for(int i = 0; i<binaryString.length(); i++) {
            if(binaryString.charAt(i) == '0') {
                cur = cur.left;
            }else if (binaryString.charAt(i) == '1') {
                cur = cur.right;
            }
            if(cur.right == null && cur.left == null) {
                // this means we reached a leaf node.
                ans += cur.data;
                cur = root;
            }
        }
        return ans;
    }
}