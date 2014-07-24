
package edu.state.comenum;

public class Pedido {
    
    SituacaoPedido situacaoPedido = SituacaoPedido.EM_ANDAMENTO;

    public void setSituacaoPedido(SituacaoPedido situacaoPedido) {
        System.out.println("Alterando status " + situacaoPedido);
        if (this.situacaoPedido.isAlowwedTo(situacaoPedido))
            this.situacaoPedido = situacaoPedido;
        else
            throw new IllegalArgumentException("Não pode ser trocado de " + 
                    this.situacaoPedido + " para " + situacaoPedido);
    }

    public SituacaoPedido getSituacaoPedido() {
        return situacaoPedido;
    }
    
}
