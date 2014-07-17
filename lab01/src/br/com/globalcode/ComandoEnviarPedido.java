

package br.com.globalcode;

public class ComandoEnviarPedido implements ComandoApp {
    
    public void execute(ProgressPublissher publisher){
         ConfigManager config = ConfigManager.getInstance();
        String server = config.getServerName();
        publisher.start("Conexão com servidor " + server +"\n");
        //Código de envio do pedido por email
        publisher.progress("Enviando Pedido por Email...");
    }
    
}
