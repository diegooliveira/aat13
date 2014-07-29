
package edu.decorator;


public class CascadUserDataRetriever implements UserDataRetriever {
    
    private final UserDataRetriever[] options;

    public CascadUserDataRetriever(UserDataRetriever... options) {
        this.options = options;
    }
    
    @Override
    public UserData retrieve(int id) {
        for(UserDataRetriever opt : options){
            UserData ud = opt.retrieve(id);
            if (ud != null)
                return ud;
        }
        
        throw new RuntimeException("No user data avealible");
    }
    
}
