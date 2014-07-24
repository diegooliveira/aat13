
package edu.status.padrao;

public class SituacaoClienteNovo implements SituacaoCliente {

    @Override
    public void novo(Cliente c) {
        System.out.println("Registrando no sistema de auditoria"); 
    }

    @Override
    public void inativo(Cliente c) {
        //Ir no banco de dados para fazer validações, etc....
        System.out.println("Valida pendencias e debitos"); 
        
        c.setSituacaoCliente(new SituacaoClienteInativo());
    }
    
}
