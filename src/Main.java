import collections.MyArrayList;
import collections.MyStack;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by 1 on 18.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        String[] animals = new String[]{"cat", "dog", "pig", "dragon", "elephant"};
        MyArrayList<String> list = new MyArrayList<String>(animals);
        list.add("rereyz");
        list.remove(0);

       for(int i = 0; i < list.size(); i++){
           System.out.println(list.getIndex(i));
       }
        MyStack<String>stringMyStack = new MyStack<>(5);
        stringMyStack.push("Кот");
        stringMyStack.push("Кот1");
        stringMyStack.push("Кот2");
        stringMyStack.push("Кот3");
        stringMyStack.push("Кот4");
        int x = stringMyStack.size();

        //for(int i = 0; i < x; i++){
       //     String s = stringMyStack.pop();
        //    System.out.println(s);
        }
    }


