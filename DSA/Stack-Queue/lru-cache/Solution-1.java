import java.util.*;

class LRUCache {

    // Doubly Linked List Node
    class Node {
        int key, value;
        Node prev, next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private Map<Integer, Node> map;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(-1, -1);   // Dummy head
        this.tail = new Node(-1, -1);   // Dummy tail
        head.next = tail;
        tail.prev = head;
    }

    // Get: O(1)
    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);
        remove(node);
        addToHead(node);   // Recently used
        return node.value;
    }

    // Put: O(1)
    public void put(int key, int value) {
        // Agar key already exists → update karo
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            addToHead(node);
            return;
        }

        // Naya node banao
        Node newNode = new Node(key, value);

        // Capacity full? → LRU remove karo
        if (map.size() == capacity) {
            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }

        addToHead(newNode);
        map.put(key, newNode);
    }

    // Node ko DLL se remove karo
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Node ko head ke paas add karo (MRU)
    private void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}