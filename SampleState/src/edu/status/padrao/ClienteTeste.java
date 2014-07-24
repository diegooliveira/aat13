

package edu.status.padrao;


public class ClienteTeste {
    
    public static void main(String[] args) {
        
        // Internalizacao da lógica
        Cliente cliente = carregaClienteDoDao();
        
        // logica especifica para validar qual método chamar.
        // dentro das implementações de de cada estatus terá
        // a lógica global a ser aplicada na troca de estado.
        cliente.inativar();
        
        cliente.novo();
        cliente.inativar();

        cliente.inativar();
        salvaClienteNoDao(cliente);
    }

    private static Cliente carregaClienteDoDao() {
        System.out.println("Vai no banco e carrega o cliente");
        return new Cliente();
    }

    private static void salvaClienteNoDao(Cliente cliente) {
        System.out.println("Salva o cliente no banco de dados");
    }
    
}
