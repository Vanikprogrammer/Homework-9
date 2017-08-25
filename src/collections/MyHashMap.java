package collections;

/**
 * Created by 1 on 23.08.2017.
 */
public class MyHashMap<K,V> {
    private V value;
    private K key;
    private Node <K,V> first;
    private int size = 0;

    public MyHashMap(K key, V value){
        this.key = key;
        this.value = value;
        put(key,value);
    }
    public void put(K key, V value) {
        if(first.key == key){
            Node<K, V> node = new Node<K, V>(key, value, null);
            first = node;
        }else {
        Node<K, V> node = new Node<K, V>(key, value, null);
        first.prev = node;
        first = node;
        size++;}

    }
    public void remove(K key){
        Node<K,V> x;
        for (x = first; x != null; ){
            if(x.key == key){
                x = x.prev;
            }
            x = first.prev;
        }
        first = x;
        size--;
    }
    public void clear(){
        for (Node<K,V> x = first; x != null; ) {
            Node<K,V> next = x.prev;
            x.key = null;
            x.value = null;
            x = next;
        }
        first = null;
        size = 0;
    }
    public int size(){
        return size;
    }

    public Node get(K key){
        Node<K, V> x;
        for (x = first; x != null; ){
            if(x.key == key){
                return x;
            }
        }return null;
    }

    private class Node<K, V>{
        K key;
        V value;
        Node<K,V> prev;

        public Node(K key, V value, Node<K,V> prev){
            this.value = value;
            this.key = key;
            this.prev = prev;
        }
    }
}
