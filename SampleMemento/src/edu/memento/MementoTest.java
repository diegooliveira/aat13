

package edu.memento;

import java.util.LinkedList;
import java.util.List;

public class MementoTest {
    
    public static void main(String[] args) {
        
        List<Memento> mementos = new LinkedList<>();
        
        EditorUsuario editor = new EditorUsuario();
        mementos.add(editor.saveToMemento());
        
        editor.setAge(20);
        editor.setName("Joao");
        editor.print();
        mementos.add(editor.saveToMemento());
        
        //UNDO
        editor.setAge(30);
        editor.setName("Anas");
        editor.loadFromMemento(mementos.get(mementos.size()-1));
        editor.print();
        
        //UNDO
        editor.loadFromMemento(mementos.get(mementos.size()-2));
        editor.print();
        
        //REDO
        editor.loadFromMemento(mementos.get(mementos.size()-1));
        editor.print();
    }
    
}
