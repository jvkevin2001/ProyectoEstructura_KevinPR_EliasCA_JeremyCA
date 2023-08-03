
package Estructura.Orden;

import Objetos.Orden;


public class NodoCola_Orden {
   
   //Creacion de los atributos de la clase NodoCola//
    
   
    private Orden orden; 
    private NodoCola_Orden atras;

   //Creacion del constructor lleno de la clase NodoCola//
    
    public NodoCola_Orden() {
        this.orden = null;
        this.atras = null;
    }

    //Se crearon los getts and setters de la clase NodoCola
    
    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public NodoCola_Orden getAtras() {
        return atras;
    }

    public void setAtras(NodoCola_Orden atras) {
        this.atras = atras;
    }

    
}
