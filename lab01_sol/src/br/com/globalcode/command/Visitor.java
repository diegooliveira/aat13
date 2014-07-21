
package br.com.globalcode.command;

public interface Visitor {

    public void visit(EnviarPorEMail target);
    public void visit(ExcluirPedido target);
    public void visit(GerarPDF target);
    public void visit(NovoPedido target);
    
}
