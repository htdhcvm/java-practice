package practice;

import java.util.Objects;

public class JavaNull {
    public static void main(String[] args) {
        int i = 10;
        // int i2 = null; //<nulltype> cannot be converted to int
        Integer i3 = null;
        
        i = Objects.requireNonNullElse(i3, 100);
        
        System.out.println(i);
    }
}
