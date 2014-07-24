

package edu.mediator.fechador;

import edu.mediator.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 * Mediator, sabe sobre sequancia de açoes, entende um
 * pouco da lógica da operação, etc.
 */
class FechadorSaldoPadrao implements FechadorSaldos {

    List<AnalisadorFechamentoSaldo> aceitaComResalvas, rejeita;
    
    public FechadorSaldoPadrao() {
        aceitaComResalvas = new ArrayList<>();
        aceitaComResalvas.add(new PendenteEntregaProduto());
        
        rejeita = new ArrayList<>();
        rejeita.add(new AnalisadorDebitos());
    }

    @Override
    public double fecharSaldo(Cliente cliente) {
        
        return 0;
    }
}
