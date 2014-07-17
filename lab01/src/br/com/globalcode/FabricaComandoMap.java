package br.com.globalcode;

import java.util.HashMap;
import java.util.Map;

public class FabricaComandoMap implements FabricaComando {

    private final Map<String, ComandoApp> comandos = new HashMap<String, ComandoApp>();

    public FabricaComandoMap() {
        comandos.put(ComandoExcluirPedido.Nome, new ComandoExcluirPedido());
        comandos.put(ComandoGerarPDF.Nome, new ComandoGerarPDF());
        comandos.put(ComandoNovoPedido.Nome, new ComandoNovoPedido());
        comandos.put(ComandoEnviarPedido.Nome, new ComandoEnviarPedido());
    }

    public ComandoApp criar(String nome) {
        if (!comandos.containsKey(nome)) {
            throw new IllegalArgumentException("Comando não encontrado" + nome);
        }

        return comandos.get(nome);
    }
}
