

package edu.status.padrao;


public class SituacaoClienteInativo implements SituacaoCliente {

    @Override
    public void novo(Cliente c) {
        System.out.println("Limpando dados passados");
        c.setSituacaoCliente(new SituacaoClienteNovo());
    }

    @Override
    public void inativo(Cliente c) {
        
        throw new IllegalStateException("Troca de estadp de inativo para inativo é invalida");
    }
    
}
