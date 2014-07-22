

package br.com.globalcode.command;

import br.com.globalcode.AcionarSistemaContabil;
import br.com.globalcode.visitor.Visitor;
import javax.swing.JTextArea;


public class AcionarSistemaContabilCommandAdapter implements BaseCommand{

    public void executar(JTextArea taMensagens) {
        // Adaptando a chamada....
        AcionarSistemaContabil comando = new AcionarSistemaContabil();
        comando.executarOperacaoContabil();
    }

    public void accept(Visitor visitor) {
        
    }
    
}
