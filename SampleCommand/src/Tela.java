
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Tela implements ActionListener, Comunicavel {
    
    Map<String, ComandoTela> mapaComandos = new HashMap<>();

    public Tela() {
        mapaComandos.put("salvar", new ComandoSalvar());
        mapaComandos.put("imprimir", new ComandoImprimir());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        mapaComandos.get(e.getActionCommand()).execute(this);
    }

    @Override
    public void informe(Prioridade prioridade, String pronto) {
        switch(prioridade){
            case Normal:
                // atualiza a label
                break;
            case Importante:
                // Da um alerta
                break;
        }
    }
    
}
