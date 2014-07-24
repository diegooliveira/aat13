
package edu.mediator.fechador;

import edu.mediator.Cliente;


class PendenteEntregaProduto implements AnalisadorFechamentoSaldo {
    
    @Override
    public boolean podeFechar(Cliente cliente) {
        return true;
    }
    
}
