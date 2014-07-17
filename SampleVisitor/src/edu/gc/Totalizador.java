package edu.gc;

class Totalizador implements Visitor {

    double total;
    
    double getTotal() {
        return total;
    }

    @Override
    public void visita(Object target) {
        if( target instanceof Precificavel){
           total +=  ((Precificavel)target).getValor();
        }
    }
}
