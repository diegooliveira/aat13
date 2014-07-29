

package edu.chain;

import java.io.File;

public class TesteChain {

    public static void main(String[] args) {
        
        ProcessadorArquivo proc = Processadores.fromXml("/tmp/xml");
        
        ProcessadorArquivo processador = Processadores.defaultProcessor();
        processador.processa(new File("/tmp/teste"));
        
    }
    
}
