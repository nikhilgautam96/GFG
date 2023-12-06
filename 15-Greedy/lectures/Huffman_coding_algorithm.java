// Time : O(N * Log N) "for building the tree" + 
//        theta(N) "for traversing and printing the huffman codes" (as there are 2N-1 nodes in tree)
// Space : O(N) "for the Priority Queue"
package Greedy.lectures;
import java.util.*;
public class Huffman_coding_algorithm {
    class Node {
        char ch;
        int freq;
        Node left, right;
        Node(char ch, int freq, Node left, Node right) {
            this.ch = ch; this.freq = freq;
            this.left = left; this.right = right;
        }
    }
    void print_Huffman_Codes(Node root, String str) {
        if(root != null) {
            if(root.ch != '$') {
                System.out.println("Hufman Code for : "+root.ch+" is - "+str);
                return;
            }
            print_Huffman_Codes(root.left, str + "0");
            print_Huffman_Codes(root.right, str + "1");
        }
    }
    void huffmanTree(char arr[], int freq[]) {
        // Sorting in ascending order of frequency.
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b)->(a.freq - b.freq));
        for(int i = 0; i<arr.length; i++) {
            pq.add(new Node(arr[i], freq[i], null, null));
        }
        while(pq.size() > 1) {
            Node l = pq.poll();
            Node r = pq.poll();
            pq.add(new Node('$', l.freq + r.freq, l, r));
        }
        print_Huffman_Codes(pq.poll(), "");
    }
}
