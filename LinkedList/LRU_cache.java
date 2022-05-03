package LinkedList;
import java.util.HashMap;
public class LRU_cache {
    class LRUCache {
        static Node head = new Node(0, 0), tail = new Node(0, 0);
        static HashMap<Integer, Node> hm = new HashMap<>();
        static int capacity;
        //Constructor for initializing the cache capacity with the given value.
        LRUCache(int cap) {
            capacity = cap;
            head.next = tail;
            tail.prev = head;
        }
        //Function to return value corresponding to the key.
        public static int get(int key) {
            if(hm.containsKey(key)) {
                Node node = hm.get(key);
                delete(node);
                insert(node);
                return node.value;
            }
            return -1;
        }
        //Function for storing key-value pair.
        public static void set(int key, int value) {
            if(hm.containsKey(key)) {
                delete(hm.get(key));
            }
            if(hm.size() == capacity) {
                delete(tail.prev);
            }
            insert(new Node(key, value));
        }
        public static void delete(Node node) {
            hm.remove(node.key);
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        public static void insert(Node node) {
            hm.put(node.key, node);
            node.next = head.next;
            node.next.prev = node;
            head.next = node;
            node.prev = head;
        }
        static class Node {
            Node prev, next;
            int key, value;
            public Node(int _key, int _value) {
                key = _key; value = _value;
            }
        }
    }
}
