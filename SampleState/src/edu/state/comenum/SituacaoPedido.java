
package edu.state.comenum;

import java.util.Arrays;


public enum SituacaoPedido {
    
    EM_ANDAMENTO(1, 2, 3),
    ENVIADO(2),
    CANCELADO(3);
    
    private final int code;
    private final int[] allowedChange;
    
    SituacaoPedido(int code, int... allowedChange){
        this.code = code;
        this.allowedChange = allowedChange;
    }

    public int getCode() {
        return code;
    }

    boolean isAlowwedTo(SituacaoPedido situacaoPedido) {
       return Arrays.binarySearch(allowedChange, situacaoPedido.code) >= 0;
    }
}
