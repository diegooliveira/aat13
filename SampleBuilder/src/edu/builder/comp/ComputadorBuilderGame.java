package edu.builder.comp;

class ComputadorBuilderGame implements ComputadorBuilder {

    @Override
    public Computador build() {

        return null;
    }

    @Override
    public ComputadorBuilder with(HardDisk hardDisk) {
        return this;
    }

    @Override
    public ComputadorBuilder with(Memory hardDisk) {
        return this;
    }
}
