/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.decorator;

import java.util.Map;

/**
 *
 * @author turma1
 */
class CachedUserDataRetriever implements UserDataRetriever {
    
    private final ContigencyUserDataRetriever target;
    Map<Integer, UserDataInfo> cache;

    public CachedUserDataRetriever(ContigencyUserDataRetriever target) {
        this.target = target;
    }

    @Override
    public UserData retrieve(int id) {
        
        if (cache.containsKey(id)) {
            UserDataInfo info = cache.get(id);
            if(info.isStillValid())
                return info.value();
            else
                cache.remove(id);
        }
        
        UserData ud = target.retrieve(id);
        cache.put(id, new UserDataInfo(ud));
        return ud;
    }
    
    private static class UserDataInfo {
        private final UserData ud;
        long requestDate;

        private UserDataInfo(UserData ud) {
            this.ud = ud;
            requestDate = System.currentTimeMillis();
        }

        private boolean isStillValid() {
            return System.currentTimeMillis() - requestDate <= 5000;
        }

        private UserData value() {
            return ud;
        }
        
    }
            
    
    
}
