
package br.com.globalcode.factory;

import br.com.globalcode.command.EnviarPorEMail;
import br.com.globalcode.command.ExcluirPedido;
import br.com.globalcode.command.GerarPDF;
import br.com.globalcode.command.NovoPedido;
import br.com.globalcode.command.Visitor;


public class LogVisitor implements Visitor {

    public void visit(EnviarPorEMail target) {
        System.out.println("Enviando pedido por email");
    }

    public void visit(ExcluirPedido target) {
        System.out.println("Excluindo pedido");
    }

    public void visit(GerarPDF target) {
        System.out.println("Gerando PDF");
    }

    public void visit(NovoPedido target) {
        System.out.println("Criando pedido");
    }
    
}
