package br.com.globalcode.command;

import br.com.globalcode.ConfigManager;
import br.com.globalcode.visitor.Visitor;
import javax.swing.JTextArea;

public class GerarPDF implements BaseCommand{
    
    public void executar(JTextArea taMensagens) {
        ConfigManager config = ConfigManager.getInstance();
        String server = config.getServerName();
        taMensagens.setText("Conex�o com servidor " + server+"\n");
        //C�digo de gera��o do arquivo PDF
        taMensagens.append("Gerando PDF do pedido...");
    }
    
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
