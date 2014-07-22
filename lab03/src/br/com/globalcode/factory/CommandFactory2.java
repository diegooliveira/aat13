package br.com.globalcode.factory;

import br.com.globalcode.command.BaseCommand;
import br.com.globalcode.filesystem.FileChangeObserver;
import br.com.globalcode.filesystem.ObservadorArquivos;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.util.Properties;

public class CommandFactory2 implements CommandFactory, FileChangeObserver {

    Properties apelidosComandos = new Properties();

    public BaseCommand create(String name) {
        BaseCommand command = null;
        String stringClasse = apelidosComandos.getProperty(name);
        try {
            Class classe = Class.forName(stringClasse);
            Object object = classe.newInstance();
            command = (BaseCommand) object;
        } catch (Exception e) {
            System.out.println("Erro na criação do Command " + e.getMessage());
            e.printStackTrace();
        }
        return command;
    }

    private static final String path = "/home/turma1/NetBeansProjects/lab03/commands.properties";
    
    public CommandFactory2() {
        fileChanged(path);
        ObservadorArquivos observador = new ObservadorArquivos(path);
        observador.addObserver(this);
    }

    public void fileChanged(String path) {
        try {
            FileInputStream fin = null;
            try {
                fin = new FileInputStream(path);
                apelidosComandos.clear();
                apelidosComandos.load(fin);
            } finally {
                if (fin != null)
                    fin.close();
            }
        } catch (Exception ex) {
            System.out.println("Erro carregando commands.properties" + ex.getMessage());
            ex.printStackTrace();
        }
    }

}
