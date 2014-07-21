
package sampleadapter;


public class FormAdicionaParticipanteV1Adapter implements Participante{
    private final FormAdicionaParticipanteV1 partV1;

    public FormAdicionaParticipanteV1Adapter(FormAdicionaParticipanteV1 partV1) {
        this.partV1 = partV1;
    }

    
    
    @Override
    public Integer getAge() {
        return 0;
    }

    @Override
    public String getName() {
        return partV1.getNome();
    }

    
    
}
