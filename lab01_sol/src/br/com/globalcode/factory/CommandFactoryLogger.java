package br.com.globalcode.factory;

import br.com.globalcode.command.BaseCommand;

public class CommandFactoryLogger extends CommandFactoryVisitor {

    LogVisitor logVisitor = new LogVisitor();

    @Override
    public void addVisitor(BaseCommand comando) {
        comando.accept(logVisitor);
    }
}
