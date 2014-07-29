package br.com.globalcode.command;

import br.com.globalcode.command.chain.CommandInterceptor;

@CommandInterceptor(posProcess=true, preProcess=true,
interceptor="log, audit, seguranca")
public class EnviarPorEmail extends BaseCommand{
  
  public EnviarPorEmail() {
  }
  public void executar() {
    System.out.println("Enviando pedido por e-mail");
  }
  
}
