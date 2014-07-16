
class ComandoImprimir implements ComandoTela {

    @Override
    public void execute(Comunicavel comunicavel) {
        comunicavel.informe(Comunicavel.Prioridade.Normal, "Imprimindo");
        comunicavel.informe(Comunicavel.Prioridade.Importante, "Pronto");
    }
    
}
