
package edu.mediator;

import edu.mediator.fechador.FechadorSaldos;
import edu.mediator.fechador.FechadoresSaldo;

public class Main {
    
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        FechadorSaldos fechador = FechadoresSaldo.padrao();
        double value = fechador.fecharSaldo(joao);
    }
    
}
