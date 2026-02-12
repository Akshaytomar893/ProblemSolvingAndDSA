import java.util.HashMap;
class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
        Node(int _key, int _val){
            this.key = _key;
            this.val = _val;
        }
    }
    HashMap<Integer, Node> LRU = new HashMap<>();
    int size;
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    public LRUCache(int capacity) {
        this.size = capacity;
        head.next=tail;
        tail.prev=head;
    }
    private void deleteNode(Node node){
        Node delPrev = node.prev;
        Node delNext = node.next;
        delPrev.next = delNext;
        delNext.prev = delPrev;
    }
    private void addNode(Node node){
        node.next=head.next;
        head.next.prev= node;
        head.next= node;
        node.prev=head;
    }
    
    public int get(int key) {
        if(LRU.containsKey(key)){
            Node result = LRU.get(key);
            int val = result.val;
            deleteNode(result);
            LRU.remove(key);
            Node newNode = new Node(key, val);
            LRU.put(key, newNode);
            addNode(newNode);

            return val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(LRU.containsKey(key)){
            deleteNode(LRU.get(key));
            LRU.remove(key);
        }
        if(LRU.size() == size){
            LRU.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        Node newNode = new Node(key, value);
        addNode(newNode);
        LRU.put(key, newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */