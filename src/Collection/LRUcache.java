package Collection;
import java.util.*;

/*public class LRUcache  <K, V> {
    private final int capacity;
    private final int HashMap<K, Node> map;
    private final int DoublyLinkedList dll;

    private class Node{
        K key;
        V value;
        Node prev, next;
        Node(K k, V v){
            key = k;
            value = v;
        }
    }
    private class DoublyLinkedList{
        Node head, tail;
        DoublyLinkedList(){
            head = new Node(null,null);
            tail= new Node(null,null);
            head.next = tail;
            tail.prev = head;
        }
        void moveToFront(Node node){
            remove(node);
            addFirst(node);
        }
        void addFirst(Node node){
            node.next=head.next;
            node.prev=head;
            head.next.prev=node;
            head.next=node;
        }
        void removeLast(){
            if (tail.prev==head)
                return null;
            Node last = tail.prev;
            remove(last);
            return last;
        }
    }
    public LRUcache(int capacity){
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.dll =  new DoublyLinkedList();
    }
    public V get(K key){
        if (!map.containsKey(key)) return null;
        Node node = map.get(key);
        dll.moveToFront(node);
        return node.value;
    }
    public void put(K key, V value){
        if (map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            dll.moveTOFront(node);
        }else {
            if (map.size() == capacity){
                Node lru = dll.removeLast();
                if (lru !=null){
                    map.remove(lru.key);
                }
            }
            Node newNode =new Node(key,value);
            dll.addFirst(newNode);
            map.put(key, newNode);;
        }
    }
    public void display(){
        Node current =dll.head.next;
        while (current != dll.tail){
            System.out.println(current.key +":" + current.value +" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LRUcache<Integer, String> cache = new Collection.LRUcache<Object, String>(3);
        cache.put(1,"one");
        cache.put(2,"Two");
        cache.put(3,"Three");
        cache.display();
        cache.get(2);
        cache.display();
        cache.put(4,"Four");
        cache.display();
    }
}*/


class LRUcache<K, V> extends LinkedHashMap<K, V>{
    private final int capacity;
    public LRUcache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest){
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUcache<Integer, String> cache = new LRUcache<Integer, String>(3);
        cache.put(1, "one");
        cache.put(2, "Two");
        cache.put(3, "Three");
        System.out.println(cache);

        cache.get(1);
        cache.put(4, "Four");
        System.out.println(cache);
    }
}
