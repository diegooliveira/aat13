package br.com.globalcode.lab5;

public interface StatusTela {

    public void cancelar(MainUI ui);

    public void editar(MainUI ui);

    public void salvar(MainUI ui);
    
    public void moverParaAnterior(MainUI ui);

    public void moverParaProximo(MainUI ui);

    public void novo(MainUI aThis);

}
