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


interface Test1 {
    default void asd() {
        System.out.println("reqw");
    }
}

class Super {
    public void asd() {
        System.out.println("qwer");
    }
}

class Pr extends Super implements Test1 {
}


interface Lol {
    void printName();
}

interface Kek {
    default void printName() {
        System.out.println("kek");
    }
}

class LolKek implements Lol, Kek {
    public void printName() {
        Kek.super.printName();
    }
}

public class DefaultMethodInterface {
    
    public static void main(String[] args) {
        A a = new A();
        
        a.lol();


//        new Pr().asd();
        new LolKek().printName();
    }
}
