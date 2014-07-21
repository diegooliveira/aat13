package br.com.globalcode.command;

import br.com.globalcode.ConfigManager;
import br.com.globalcode.visitor.Visitor;
import javax.swing.JTextArea;

public class ExcluirPedido implements BaseCommand{
    public void executar(JTextArea taMensagens) {
        ConfigManager config = ConfigManager.getInstance();
        String server = config.getServerName();
        taMensagens.setText("Conex�o com servidor " + server+"\n");
        //C�digo de exclus�o de pedido
        taMensagens.append("Excluindo pedido do sistema...");
    }
    
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
