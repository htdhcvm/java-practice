package practice;

import java.util.Objects;

public class HashCode {
    public static void main(String[] args) {
        String s = "Ok";
        StringBuilder sb = new StringBuilder(s);
        
        System.out.println(s.hashCode() + " " + sb.hashCode());
        
        String t = new String("Ok");
        StringBuilder tb = new StringBuilder(t);
        
        System.out.println(t.hashCode() + " " + tb.hashCode());
        
        System.out.println(Objects.hash(s, t));
    }
}
