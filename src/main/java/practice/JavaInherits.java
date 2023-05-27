package practice;

class Test1 {
    private int test = 10;
    
    public int getTest() {
        return test;
    }
}

class Test2 extends Test1 {
    private int test = 2;
    
    public int getTestPlusOne() {
        return test + 1;
    }
}


class A {
    public static void foo() {
        System.out.println("A: foo");
    }
    
    public static void foo(String s) {
        System.out.println("A: foo" + s);
    }
}


class B extends A {
    public static void foo() {
        System.out.println("B: foo");
    }
    
}


public class JavaInherits {
    public static void main(String[] args) {
        A a = new B();
        a.foo();
        a.foo("asd");
    }
}
