package Estructura_cintaTransportadora;

public class Lista_cintaTransportadora {
   //atributos//
    private NodoLista_CintaTransportadora cabeza;
    private NodoLista_CintaTransportadora ultimo;
    private int largo;
    private boolean disponible = true;
    
    public  boolean disponible(){
        return disponible;
    }
    
    
    public int tamanio() {
        return largo;
    }
    
    
     public boolean vacia(){
        boolean vacia= false;
        if(cabeza == null){
            vacia = true;
        }
        return vacia;
    }
    
}
