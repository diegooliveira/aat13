package sampleadapter;

/**
 * Esse objeto não pode ser modificado porque é um elemento de acesso publico
 * { "nome" : "ana" }
 */
public class FormAdicionaParticipanteV1 {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
