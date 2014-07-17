
package br.com.globalcode;

public class FabricaComandoSimples implements FabricaComando {
    
    public ComandoApp criar(String nome){
        if (nome.equals(ComandoEnviarPedido.Nome) )
            return new ComandoEnviarPedido();
        
        else if(nome.equals(ComandoGerarPDF.Nome) )
            return new ComandoGerarPDF();
        
        else if(nome.equals(ComandoNovoPedido.Nome) )
            return new ComandoNovoPedido();
        
        else if(nome.equals(ComandoExcluirPedido.Nome) )
            return new ComandoExcluirPedido();
        
        else 
            throw new IllegalArgumentException("Commando não encotrado " + nome);
    }
    
}
