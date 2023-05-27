package practice;


import java.util.ArrayList;

interface PersonChecks {
    boolean check(Person p);
}

class PersonCheckAvgGrade implements PersonChecks {
    
    @Override
    public boolean check(Person p) {
        return p.avgGrade > 8;
    }
}

class PersonInfo {
    void filterPersons(ArrayList<Person> persons, PersonChecks cb) {
        for (Person p : persons) {
            if (cb.check(p)) {
                System.out.println(p);
            }
        }
    }
}

public class lambda {
    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<>();
        final PersonInfo pi = new PersonInfo();
        
        final Person p1 = new Person("p1", 'm', 12, 2, 8);
        final Person p2 = new Person("p2", 'f', 22, 1, 9);
        final Person p3 = new Person("p3", 'm', 32, 0, 4);
        final Person p4 = new Person("p4", 'f', 42, 3, 1.2);
        final Person p5 = new Person("p5", 'm', 12, 4, 8.42);
        
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        
        pi.filterPersons(p, new PersonCheckAvgGrade());
        System.out.println("\n");
        pi.filterPersons(p, new PersonChecks() {
            @Override
            public boolean check(Person p) {
                return p.age < 30;
            }
        });
        
        System.out.println("\n");
        pi.filterPersons(p, (Person person) -> {
            return person.age > person.avgGrade;
        });
        
        int test = 1;
        final PersonChecks check = (Person person) -> {
            return true;
        };
        
        System.out.println("\n");
        pi.filterPersons(p, check);
    }
}
