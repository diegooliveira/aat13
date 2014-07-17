package br.com.globalcode;

import java.util.HashMap;
import java.util.Map;

public class FabricaComandoMap implements FabricaComando {

    private final Map<String, ComandoApp> comandos = new HashMap<String, ComandoApp>();

    public FabricaComandoMap() {
        comandos.put(NomesComandos.ExcluirPedidos, new ComandoExcluirPedido());
        comandos.put(NomesComandos.GerarPdf, new ComandoGerarPDF());
        comandos.put(NomesComandos.NovoPedido, new ComandoNovoPedido());
        comandos.put(NomesComandos.EnviarPedido, new ComandoEnviarPedido());
    }

    public ComandoApp criar(String nome) {
        if (!comandos.containsKey(nome)) {
            throw new IllegalArgumentException("Comando não encontrado" + nome);
        }

        return comandos.get(nome);
    }
}
