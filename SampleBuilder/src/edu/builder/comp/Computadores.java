
package edu.builder.comp;


public class Computadores {

    static ComputadorBuilder game() {
        return new ComputadorBuilderGame();
    }

    static ComputadorBuilder server() {
       return new ComputadorBuilderServer();
    }
    
}
