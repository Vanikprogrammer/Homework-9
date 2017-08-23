package collections;

/**
 * Created by 1 on 20.08.2017.
 */
public class MyStack<T> {
    private int maxlength;
    private T[]array;
    private int top;

    public MyStack(int maxlength){
        this.maxlength = maxlength;
        array =(T[]) new Object[maxlength];
        top = -1;
    }

    public void push(T value){
        array[++top] = value;

    }
    public void remove(int index){
        T[]b = (T[])new Object[array.length - 1];
        array[index] = null;
        for(int i = index; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }
        System.arraycopy(array,0,b,0,array.length - 1);
        array = b;
        top--;
        }

    public void clear(){
        for(T t:array)
            t = null;
        top = -1;
    }
    public T peek(){
        return array[top];
    }
    public T pop(){
        return array[top--];
    }
    public int size(){
        return top + 1;
    }
}

