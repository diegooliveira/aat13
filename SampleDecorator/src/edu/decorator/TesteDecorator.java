
package edu.decorator;


public class TesteDecorator {
    
    public static void main(String[] args) {
        
        UserDataRetriever udr = new CachedUserDataRetriever(new 
            ContigencyUserDataRetriever(new RemoteWsUserDataRetriever("..."),
                    new LocalDatabaseReplicatedUserDataRetriever(null)));
        UserData ud = udr.retrieve(100);
    }
}
