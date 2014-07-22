package br.com.globalcode.filesystem;

/**
 * Implementators, be aware that the call may come from a different thread.
 */
public interface FileChangeObserver {

    public void fileChanged(String path);

}
