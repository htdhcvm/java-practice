package practice.accessModifier;

import java.util.Arrays;

enum Size {
    SMALL, MEDIUM, LARGE
}

public class Test {
    
    
    public static void increment(int i) {
        i++;
    }
    
    public static int findMax(int... numbs) {
        int min = numbs[0];
        
        for (int num : numbs) {
            if (min > num) {
                min = num;
            }
        }
        
        return min;
    }
    
    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.test);
        int i = 2;
        System.out.println(i);
        increment(i);
        System.out.println(i);
        
        System.out.println(Integer.parseInt("123"));
        System.out.println(findMax(1, 2, 3, 4, 0, 2, 2, 1, 45, -2));
        
    }
}
