

package br.com.globalcode.command.chain;

import br.com.globalcode.command.BaseCommand;

public class ValidadorDadosCommandHandler extends CommandHandler{

    @Override
    public void handle(BaseCommand command) {
        System.out.println("Validando dados");
        if (next != null)
            next.handle(command);
    }
    
}
