
package Estructura.Orden;


public class NodoCola_Orden {
   
   //Creacion de los atributos de la clase NodoCola//
    
   
    private Orden orden; 
    private NodoCola_Orden atras;

   //Creacion del constructor lleno de la clase NodoCola//
    
    public NodoCola_Orden(Orden orden, NodoCola_Orden atras) {
        this.orden = orden;
        this.atras = atras;
    }

    
}
