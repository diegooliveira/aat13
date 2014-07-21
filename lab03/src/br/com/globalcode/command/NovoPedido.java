package br.com.globalcode.command;

import br.com.globalcode.ConfigManager;
import br.com.globalcode.visitor.Visitor;
import javax.swing.JTextArea;

public class NovoPedido implements BaseCommand{
    
    public void executar(JTextArea taMensagens) {
        ConfigManager config = ConfigManager.getInstance();
        String server = config.getServerName();
        taMensagens.setText("Conex�o com servidor " + server+"\n");
        //C�digo de cria��o de um novo pedido
        taMensagens.append("Setup para novo pedido...");
    }
    
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}
