
package edu.memento;

public class Memento {
    private final int age;
    private final String name;

    Memento(int age, String name) {
        this.age = age;
        this.name = name;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
    
   
}
