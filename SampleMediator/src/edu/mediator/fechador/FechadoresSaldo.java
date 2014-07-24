
package edu.mediator.fechador;

/**
 * Fabrica de mecanismos de fechamento de saldo.
 */
public class FechadoresSaldo {
    
    public static FechadorSaldos padrao(){
        return new FechadorSaldoPadrao();
    }
    
}
