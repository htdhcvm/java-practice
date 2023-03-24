package com.dsa.app.objects;

public class Person {
        private String id;
        private String name;

        public Person(String id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            Person tmp = (Person)o;
            return this.id == tmp.id;
        }

        @Override
        public String toString() {
            return "id: " + this.id + " " + "name: " + this.name;
        }
}
