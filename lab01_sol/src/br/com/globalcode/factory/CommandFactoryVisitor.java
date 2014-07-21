
package br.com.globalcode.factory;

import br.com.globalcode.command.BaseCommand;


public abstract class CommandFactoryVisitor 
    extends CommandFactory2
    implements CommandFactory {

    // Template method.
    public abstract void addVisitor(BaseCommand comando);
    
    public BaseCommand create(String name) {
        BaseCommand command = super.create(name);
        addVisitor(command);
        return command;
    }
    
}
