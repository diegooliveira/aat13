
package br.com.globalcode;


public class ComandoNovoPedido implements ComandoApp {
    
    public void execute(ProgressPublissher publisher) {
        ConfigManager config = ConfigManager.getInstance();
        String server = config.getServerName();
        publisher.start("Conexão com servidor " + server + "\n");
        //C�digo de criação de um novo pedido
        publisher.progress("Setup para novo pedido...");
    }

}
