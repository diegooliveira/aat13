

package edu.gc;

import java.math.BigDecimal;


public class Main {
    
    public static void main(String args[]){
        
        // Com arvore de objetos ===============================
        CombinadoDeGrao combinadoGrao = new CombinadoDeGrao();
        combinadoGrao.adicionar(new NozesNacionais());
        combinadoGrao.adicionar(new CastanhasNacionais());
        
        CestaPresentes cesta = new CestaPresentes();
        cesta.addCombinado(combinadoGrao);
        cesta.addExtra(new CartaoAniversario());
        cesta.setEntrega(new EntregaMesmoBairro());
        // =====================================================
        
        
        // Vistitar para pegar o total.
        Totalizador totalizador = new Totalizador();
        cesta.processar(totalizador);
        double total = totalizador.getTotal();
        
        // Vistitar para pegar o peso.
        ExtratorPeso extrPeso = new ExtratorPeso();
        cesta.processar(extrPeso);
        BigDecimal pesoTotal = extrPeso.getPesoTotal();
    }
}
