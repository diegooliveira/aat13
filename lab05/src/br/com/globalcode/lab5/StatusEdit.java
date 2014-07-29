package br.com.globalcode.lab5;

public class StatusEdit extends AbstractStatusTela {

    public void cancelar(MainUI ui) {
        ui.mementoController.undo();
        ui.bindCurrentRecord();
        ui.setStatus(new StatusView());
        ui.uiEditable(false);
    }

    public void editar(MainUI ui) {
        
        System.out.println("Já está editando");
    }

    public void salvar(MainUI ui) {
        System.out.println("Salvando dados no objeto");
        ui.setStatus(new StatusView());
        ui.uiEditable(false);
    }

}
