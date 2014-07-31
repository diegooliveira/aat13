

package edu.builder.comp;


public interface ComputadorBuilder {

    // Interface fluente
    public ComputadorBuilder with(HardDisk hardDisk);
    public ComputadorBuilder with(Memory hardDisk);

    public Computador build();
    
}
