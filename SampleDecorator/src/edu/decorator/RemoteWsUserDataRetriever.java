
package edu.decorator;

public class RemoteWsUserDataRetriever implements UserDataRetriever{
    
    private final String remoteWsAddres;

    public RemoteWsUserDataRetriever(String remoteWsAddres) {
        this.remoteWsAddres = remoteWsAddres;
    }

    @Override
    public UserData retrieve(int id) {
        
        return null;
    }
    
}
