package br.com.globalcode.filesystem;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class ObservadorArquivos implements Runnable {

    private final String path;

    public ObservadorArquivos(String path) {
        System.out.println("Novo observador para " + path);
        this.path = path;
        new Thread(this).start();
    }

    public void run() {
        File file = new File(path);
        long lastDate = file.lastModified();
        while(true){
            try{
                Thread.sleep(500);
            } catch(InterruptedException ex){
                break;
            }
            if (lastDate < file.lastModified()){
                System.out.println("O arquivo " + path + " mudou." );
                fireObserver();
                lastDate = file.lastModified();
            }
        }
    }

    private List<FileChangeObserver> observers = new LinkedList<FileChangeObserver>();

    public void addObserver(FileChangeObserver observer){
        observers.add(observer);
    }

    private void fireObserver(){
        for(FileChangeObserver observer : observers)
            observer.fileChanged(path);
    }
}
