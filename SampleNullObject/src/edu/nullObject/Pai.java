

package edu.nullObject;


public class Pai {
    
    Filho filho = Filho.nenhum();
    
    void saveTo(FileWritter fw){
        fw.write("id",100);
        filho.saveTo(fw);
    }
}
