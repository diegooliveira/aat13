
package br.com.globalcode;


public class FabricaComandosAbstratos {
    
    public FabricaComando build(){
        return new FabricaComandoMap();
    }
    
}
