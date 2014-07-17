
package br.com.globalcode;

public class FabricaComandoSimples implements FabricaComando {
    
    public ComandoApp criar(String nome){
        if (nome.equals(NomesComandos.EnviarPedido) )
            return new ComandoEnviarPedido();
        
        else if(nome.equals(NomesComandos.GerarPdf) )
            return new ComandoGerarPDF();
        
        else if(nome.equals(NomesComandos.NovoPedido) )
            return new ComandoNovoPedido();
        
        else if(nome.equals(NomesComandos.ExcluirPedidos) )
            return new ComandoExcluirPedido();
        
        else 
            throw new IllegalArgumentException("Commando não encotrado " + nome);
    }
    
}
