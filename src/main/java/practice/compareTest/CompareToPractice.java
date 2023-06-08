package practice.compareTest;


import org.jetbrains.annotations.NotNull;

class Employee implements Comparable<Employee> {
    
    @Override
    public int compareTo(@NotNull Employee o) {
        return 0;
    }
}

class Manager extends Employee {
    
    @Override
    public int compareTo(Employee o) {
        Manager otherManager = (Manager) o;
        return 0;
    }
}


interface A {
    double SD = 10;
    
    Manager MD = new Manager();
    
    public static void test() {
        System.out.println("Hi");
        
    }
    
    private void test1() {
        System.out.println("hi");
    }
    
    
}

class L implements A {
    
    public void lol() {
    
    }
}

public class CompareToPractice {
    
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        e.compareTo(m);
//        m.compareTo(e);
        A.test();
        
    }
}
