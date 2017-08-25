package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by 1 on 15.08.2017.
 */
public class MyArrayList <T>  {
    private final int START_LENGTH_ARRAY = 10;
    private T[]item;
    private int size = 0;

    public MyArrayList(){
        item = (T[])new Object[START_LENGTH_ARRAY];
        size = START_LENGTH_ARRAY;
    }

    public MyArrayList(int capacity){
        if (capacity > 0) {
            item = (T[])new Object[capacity];
            size = capacity;
        }else if(capacity == 0){
            item = (T[])new Object[]{};
        }
        else {
            throw new IllegalArgumentException("Capacity: " +
                    capacity);
        }
    }

    public MyArrayList(T[]item){
            this.item = item;
            size = item.length;
    }

    public void add(T value){
        int capacity = size;
        if(capacity >= item.length)
        {
            int newcapacity = (item.length*3)/2+1;
            T[]b = (T[])new Object[newcapacity];
            System.arraycopy(item,0,b,0,item.length);
            b[size++] = value;
            item = b;
            }
        else item[size++] = value;

    }

    public void remove(int index){
        T[]b = (T[])new Object[item.length - 1];
        item[index] = null;
        for(int i = index; i < item.length - 1; i++){
            item[i] = item[i + 1];
        }
        System.arraycopy(item,0,b,0,item.length - 1);
        item = b;
        size--;
    }
    public void clear(){
        for(int i = 0; i < item.length; i++)
            item[i] = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public T getIndex(int index) {
        return item[index];
    }
}
