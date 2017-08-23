package collections;


/**
 * Created by 1 on 19.08.2017.
 */
public class MyLinkedList <T> {
    private Node <T> first;
    private Node <T> last;
    private int size = 0;

    public MyLinkedList(T[]array){
        first = new Node<>(null,array[0],null);
        last = first;
        size = 1;
            for(int i = 1; i < array.length; i++){
                add(array[i]);
            }
    }


    public void add(T item) {
        Node<T> node = new Node<T>(last, item,null );
        last.next = node;
        last = node;
        size++;
    }
    public Node remove(int index){
        Node <T> current = first;
        Node <T> prev = first;
            while (size!=index){
                if(current.next==null)
                    return null;
                else
                    prev = current;
                    current = current.next;
            if(current==first)
            {first = first.next;
            size--;}
            else{ prev.next = current.next;
            size--;}
            }
            first = current;
            return first;
        }
    public void clear(){
        for (Node<T> x = first; x != null; ) {
            Node<T> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }
    public T get(int index){
        Node<T> iterator = first;
        for (int i = 0; i < size; i++){
            iterator = iterator.next;
            if(i==index)
                return iterator.item;
        }
        return null;
    }


    public class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }


    }



}
