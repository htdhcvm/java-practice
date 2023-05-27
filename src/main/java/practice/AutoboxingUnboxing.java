package practice;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        Integer iOb1 = 100;
        Integer iOb2 = 100;
        System.out.println(iOb1 == iOb2);
        
        Integer iOb3 = new Integer(120);
        Integer iOb4 = new Integer(120);
        System.out.println(iOb3 == iOb4);
        
        Integer iOb5 = 200;
        Integer iOb6 = 200;
        System.out.println(iOb5 == iOb6);
        
        
        Integer iOb7 = 1000;
        Integer iOb8 = 1000;
        System.out.println(iOb7 == iOb8);
        
        
        Integer iOb9 = 127;
        Integer iOb10 = 127;
        System.out.println(iOb9 == iOb10);
        
        Integer iOb11 = -128;
        Integer iOb12 = -128;
        System.out.println(iOb11 == iOb12);
        
        
        Integer iOb13 = new Integer(127);
        Integer iOb14 = new Integer(127);
        System.out.println(iOb13 == iOb14);
        
        Integer iOb15 = new Integer(-128);
        Integer iOb16 = new Integer(-128);
        System.out.println(iOb15 == iOb16);
    }
}
