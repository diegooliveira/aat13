package br.com.globalcode.factory;

import br.com.globalcode.command.BaseCommand;
import java.util.Properties;

public abstract class CommandFactoryVisitor extends CommandFactory2 implements CommandFactory {


    public BaseCommand create(String name) {
        BaseCommand command = super.create(name);
        addVisitor(command);
        return command;
    }

    public abstract void addVisitor(BaseCommand command);
}
