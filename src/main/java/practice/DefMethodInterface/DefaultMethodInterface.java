package practice.DefMethodInterface;


interface Test {
    
    default void lol() {
        System.out.println("lol");
    }
}


class A implements Test {
    
    @Override
    public void lol() {
        System.out.println("kek");
    }
}

public class DefaultMethodInterface {
    
    public static void main(String[] args) {
        A a = new A();
        
        a.lol();
    }
}
