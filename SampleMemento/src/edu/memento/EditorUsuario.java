
package edu.memento;


public class EditorUsuario {

    private int age;
    private String name;
    
    Memento saveToMemento() {
        return new Memento(age, name);
    }

    void loadFromMemento(Memento memento) {
        this.age = memento.getAge();
        this.name  = memento.getName();
    }

    
    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void print() {
        System.out.println("Name: " + name + " Age: " + age);
    }

    
}
