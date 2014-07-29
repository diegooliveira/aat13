package br.com.globalcode.lab5;

public class StatusView extends AbstractStatusTela {

    public void cancelar(MainUI aThis) {
        System.out.println("Nada a fazer, apenas visualizando...");
    }

    public void editar(MainUI ui) {
        ui.mementoController.record();
        ui.setStatus(new StatusEdit());
        ui.uiEditable(true);
    }

    public void salvar(MainUI ui) {
        System.out.println("Nada a fazer, apenas visualizando...");
    }
}
