
package edu.chain;

public final class Processadores {

    static ProcessadorArquivo fromXml(String tmpxml) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Processadores(){}
    
    public static ProcessadorArquivosEncadeado defaultProcessor(){
        ProcessadorArquivosEncadeado processadores = new PreenchedorDadosFaltantes();
        processadores.setNext(new RemoverLinhasInvalidas());
        
        return processadores;
    }
    
}
