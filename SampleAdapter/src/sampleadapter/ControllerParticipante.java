

package sampleadapter;

//@Controller
public class ControllerParticipante {
    
    //@RequestMapping(value="/participante/add", header="Version: v1")
    public String addParticipanteV1(FormAdicionaParticipanteV1 v1){
        addParticipante(new FormAdicionaParticipanteV1Adapter(v1));
        return "ok";
    }
    
    //@RequestMapping(value="/participante/add", header="Version: v2")
    public String addParticipanteV2(FormAdicionaParticipanteV2 v2){
    
        addParticipante(v2);
        return "ok";
    }
    
    private void addParticipante(Participante participante){       
    }
}