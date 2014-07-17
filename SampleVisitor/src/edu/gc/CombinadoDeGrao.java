
package edu.gc;

import java.util.ArrayList;
import java.util.List;

class CombinadoDeGrao {
    
    List<ItemCombinado> itens = new ArrayList<>();

    void adicionar(ItemCombinado item) {
        itens.add(item);
    }

    void processar(Visitor visitor) {
        visitor.visita(this);
    }
    
}
