
package br.com.globalcode.lab5;

import java.util.HashMap;
import java.util.Map;

public class Memento implements Comparable<Memento> {

    private final long date;
    private final String modelo;
    
    Memento(String modelo) {
        date = System.currentTimeMillis();
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
    
    
    public int compareTo(Memento other) {
        return Long.compare(this.date, other.date);
    }
    
}
