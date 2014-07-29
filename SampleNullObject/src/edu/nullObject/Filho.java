
package edu.nullObject;


public class Filho {

    static Filho nenhum() {
        return new NenhumFilho();
    }
    
    private static class NenhumFilho extends Filho {
        @Override
        void saveTo(FileWritter fw) {
            fw.write("filho_id", 999);
        }
    };

    void saveTo(FileWritter fw) {
        
    }
}
