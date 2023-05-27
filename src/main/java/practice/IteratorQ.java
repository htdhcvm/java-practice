package practice;

import java.util.*;

public class IteratorQ {
    public static void main(String[] args) {
        ArrayList<String> iter = new ArrayList<>();
        iter.add("test1");
        iter.add("test2");
        iter.add("test3");
        
        iter.remove("test3");
        Iterator<String> iterator = iter.iterator();
        
        
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(iter);
    }
}
