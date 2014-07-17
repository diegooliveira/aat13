
package br.com.globalcode;

class ComandoExcluirPedido implements ComandoApp{

    public static final String Nome = "Excluir Pedido";
    
    public void execute(ProgressPublissher publisher) {
        ConfigManager config = ConfigManager.getInstance();
        String server = config.getServerName();
        publisher.start("Conexão com servidor " + server+"\n");
        //C�digo de exclusão de pedido
        publisher.progress("Excluindo pedido do sistema...");
    }

    
}
