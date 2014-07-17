
package edu.gc;

import java.util.ArrayList;
import java.util.List;

class CestaPresentes {

    List<CombinadoDeGrao> combinados = new ArrayList<>();
    List<Extra> extras = new ArrayList<>();
    
    void addCombinado(CombinadoDeGrao combinadoGrao) {
       combinados.add(combinadoGrao);
    }

    void addExtra(Extra extra) {
        extras.add(extra);
    }

    void setEntrega(Entrega entrega) {
        
    }

    void processar(Visitor visitor) {
        visitor.visita(this);
        for(CombinadoDeGrao comb : combinados) {
            comb.processar(visitor);
        }
        
        for(Extra extra : extras)
            visitor.visita(extra);
        
    }
    
    
}
