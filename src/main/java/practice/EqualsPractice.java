package practice;

class Employee {
}

class Manager {
}

class Progger {
    @Override
    public int hashCode() {
        return super.hashCode();
//        return 1;
    }
}

public class EqualsPractice {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Progger progger = new Progger();
        
        
        System.out.println(progger.getClass());
        System.out.println(employee.getClass());
//        System.out.println(manager instanceof Employee); // Error: cannot be converted to
        System.out.println((Object) manager instanceof Employee);
        System.out.println(EqualsPractice.check(manager));
    }
    
    
    private static boolean check(Object o) {
        return o instanceof Employee;
    }
}
