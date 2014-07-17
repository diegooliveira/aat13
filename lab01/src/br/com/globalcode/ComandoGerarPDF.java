
package br.com.globalcode;

public class ComandoGerarPDF implements ComandoApp {

    public void execute(ProgressPublissher publisher) {
        ConfigManager config = ConfigManager.getInstance();
        String server = config.getServerName();
        publisher.start("Conexão com servidor " + server+"\n");
        //C�digo de geração do arquivo PDF
        publisher.progress("Gerando PDF do pedido...");
    }
    
}
