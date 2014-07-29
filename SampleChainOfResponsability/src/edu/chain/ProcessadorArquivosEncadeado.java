package edu.chain;

import java.io.File;

public abstract class ProcessadorArquivosEncadeado implements ProcessadorArquivo {

    private ProcessadorArquivo next;

    public void setNext(ProcessadorArquivo next) {
        this.next = next;
    }

    @Override
    public final void processa(File file) {
        doProcessing(file);
        if (next != null) {
            next.processa(file);
        }
    }

    protected abstract void doProcessing(File file);

}
