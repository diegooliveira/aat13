package br.com.globalcode.lab5;

public abstract class AbstractStatusTela implements StatusTela {

    public void moverParaAnterior(MainUI ui) {
        ui.dataCurrent = ui.dataIterator.componenteAnterior();
        ui.bindCurrentRecord();
        ui.setStatus(new StatusView());
        ui.uiEditable(false);
    }

    public void moverParaProximo(MainUI ui) {
        ui.dataCurrent = ui.dataIterator.proximoComponente();
        ui.bindCurrentRecord();
        ui.setStatus(new StatusView());
        ui.uiEditable(false);
    }

    public void novo(MainUI ui) {
        ui.setStatus(new StatusNovo());
        ui.oldData = ui.dataCurrent;
        ui.uiEditable(true);
    }

}
