package edu.status.padrao;


public class Cliente {
    
    SituacaoCliente situacaoCliente;

    public Cliente() {
        situacaoCliente = new SituacaoClienteNovo();
        novo();
    }
    
    public void inativar(){
       situacaoCliente.inativo(this);
    }

    
    public void setSituacaoCliente(SituacaoCliente situacaoCliente) {
        this.situacaoCliente = situacaoCliente;
    }

    public SituacaoCliente getSituacaoCliente() {
        return situacaoCliente;
    }

    public void novo() {
        situacaoCliente.novo(this);
    }
    
}
