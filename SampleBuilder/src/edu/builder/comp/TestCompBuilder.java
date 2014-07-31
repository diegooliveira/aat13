package edu.builder.comp;

public class TestCompBuilder {

    public static void main(String[] args) {

        ComputadorBuilder cpb = Computadores.game()
                .with(new HardDisk(100))
                .with(new Memory());

        Computador comp = cpb.build();
    }

}
