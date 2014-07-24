package edu.state.comenum;

/**
 * No modelo do enum a l�gica de troca de estados fica fora da classe que
 * carrega o estado.
 */
public class PedidoTeste {

    public static void main(String[] args) {
        Pedido p = carregaPedidoDoDao();
        // Faz a l�gica que precisa
        boolean podeSegir = false;
        if (podeSegir) {
            p.setSituacaoPedido(SituacaoPedido.ENVIADO);
        } else {
            p.setSituacaoPedido(SituacaoPedido.EM_ANDAMENTO);
        }
        salvaPedidoNoDao(p);
    }

    private static Pedido carregaPedidoDoDao() {
        System.out.println("Vai no banco e carrega o pedido");
        return null;
    }

    private static void salvaPedidoNoDao(Pedido p) {
        System.out.println("Salva o pedido no banco de dados");
    }
}
