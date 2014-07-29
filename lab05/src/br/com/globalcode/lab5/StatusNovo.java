package br.com.globalcode.lab5;

public class StatusNovo extends AbstractStatusTela {

    public void cancelar(MainUI ui) {
        ui.mementoController.undo(); // 2
        ui.dataCurrent = ui.oldData;
        ui.bindCurrentRecord();
        ui.setStatus(new StatusView());
        ui.uiEditable(false);
    }

    public void editar(MainUI ui) {
        ui.mementoController.record();
        System.out.println("Já está editando...");
    }

    public void salvar(MainUI ui) {
        System.out.println("Salvando novo objeto");
        ui.setStatus(new StatusView());
        ui.uiEditable(false);
    }
}
