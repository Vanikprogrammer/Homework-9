package collections;

/**
 * Created by 1 on 20.08.2017.
 */
public class MyQueue<T> {
    private T[]array;
    private int up;
    private int down;
    private int top;
    private int maxSize;

    public MyQueue(int s){
        maxSize = s;
        array = (T[])new Object[maxSize];
        up = 0;
        down = -1;
        top = 0;
    }
    public void add(T value){
        if(down==maxSize - 1)
            down = -1;
        array[++down] = value;
        top++;
    }
    public void remove(int index){
        T[]b = (T[])new Object[array.length - 1];
        array[index] = null;
        for(int i = index; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
        System.arraycopy(array,0,b,0,array.length - 1);
        array = b;
        if(up==down){
            up = 0;
            down = -1;
            top = 0;
        }
        up--;
        top--;
    }
    private void clear(){
            for(int i = 0; i < array.length; i++)
                array[i] = null;
            top = -1;
    }
    public int size(){
        return top;
    }

    public T getFirst(){
        T temp = array[up++];
        if(up == maxSize)
            up = 0;
        top--;
        return temp;
    }
    public T peeK(){
        return array[up];
    }

}
