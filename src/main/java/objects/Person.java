package objects;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable {
    private String id;
    private String name;
    private Integer course;
    
    
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
    public Person(String id, String name, Integer course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    
    @Override
    public boolean equals(Object o) {
        Person tmp = (Person) o;
        return this.id == tmp.id;
    }
    
    @Override
    public String toString() {
        return "id: " + this.id + " " + "name: " + this.name + " course: " + this.course;
    }
    
    
    @Override
    public int compareTo(@NotNull Object o) {
        Person tmp = (Person) o;
        return this.course - tmp.course;
    }
}
