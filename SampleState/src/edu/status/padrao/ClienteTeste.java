

package edu.status.padrao;


public class ClienteTeste {
    
    public static void main(String[] args) {
        
        // Internalizacao da l�gica
        Cliente cliente = carregaClienteDoDao();
        
        // logica especifica para validar qual m�todo chamar.
        // dentro das implementa��es de de cada estatus ter�
        // a l�gica global a ser aplicada na troca de estado.
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
