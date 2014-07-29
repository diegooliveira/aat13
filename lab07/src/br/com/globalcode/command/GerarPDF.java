package br.com.globalcode.command;

import br.com.globalcode.command.chain.CommandInterceptor;

@CommandInterceptor(posProcess = true, preProcess = true, interceptor = "validacao")
public class GerarPDF extends BaseCommand {

    public void executar() {
        System.out.println("Gerando PDF");
    }

}
