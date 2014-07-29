
package edu.decorator;

public class ContigencyUserDataRetriever implements UserDataRetriever {
    
    private final UserDataRetriever principal;
    private final UserDataRetriever secondary;

    public ContigencyUserDataRetriever(UserDataRetriever principal, UserDataRetriever secondary) {
        this.principal = principal;
        this.secondary = secondary;
    }
    
    @Override
    public UserData retrieve(int id) {
        try{
            
            return principal.retrieve(id);
        }catch(Exception ex){
            return secondary.retrieve(id);
        }
    }
}
