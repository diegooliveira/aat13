

package br.com.globalcode.lab5;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Controlador de memento.
 */
public class MementoController {
    
    private final MainUI ui;
    
    private SortedSet<Memento> mementos = new TreeSet<Memento>();
    
    MementoController(MainUI ui) {
        this.ui = ui;
    }

    void undo() {
        ui.loadFromMemento(mementos.last());
        mementos.remove(mementos.last());
    }

    void record() {
        mementos.add(ui.saveToMement());
    }
    
}
