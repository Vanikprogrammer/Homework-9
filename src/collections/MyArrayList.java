package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by 1 on 15.08.2017.
 */
public class MyArrayList <T>  {

    private T[]item;

        public MyArrayList(T[]item){
            this.item = item;
        }

    public T[] add(T value){
        T[]b = (T[])new Object[item.length + 1];
        System.arraycopy(item,0,b,0,item.length);
        b[b.length - 1] = value;
        item = b;
        return item;
    }

    public void remove(int index){
        T[]b = (T[])new Object[item.length - 1];
        item[index] = null;
        for(int i = index; i < item.length - 1; i++){
            item[i] = item[i + 1];
        }
        System.arraycopy(item,0,b,0,item.length - 1);
        item = b;
    }
    public void clear(){
        for(int i = 0; i < item.length; i++)
            item[i] = null;
    }

    public int size(){
        return item.length;
    }

    public T getIndex(int index) {
        return item[index];
    }
}
