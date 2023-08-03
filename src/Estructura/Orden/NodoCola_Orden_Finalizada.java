package Estructura.Orden;

import Objetos.Orden;

public class NodoCola_Orden_Finalizada {
   //Atributos
   private Orden orden; 
   private NodoCola_Orden_Finalizada atras;
   
   //Metodo Constructor
    public NodoCola_Orden_Finalizada() {
        this.orden = null;
        this.atras = null;
    }
    
    //Setter
    public void setOrden(Orden orden) {
        this.orden = orden;
    }
    public void setAtras(NodoCola_Orden_Finalizada atras) {
        this.atras = atras;
    }
    
    //Getter
    public Orden getOrden() {
        return orden;
    }
    public NodoCola_Orden_Finalizada getAtras() {
        return atras;
    }
  
}
