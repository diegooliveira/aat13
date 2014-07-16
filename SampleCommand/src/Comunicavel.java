
public interface Comunicavel {

    public void informe(Prioridade prioridade, String pronto);
    
    enum Prioridade { Importante, Normal }
    
}
