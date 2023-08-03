package Estructura.Orden;

import Objetos.Orden;

public class Cola_Orden_Finalizada {
    
    //Atributos
    private NodoCola_Orden_Finalizada frente;
    private NodoCola_Orden_Finalizada ultimo;
    private int largo;
    
    //Metodo tamanio
    public int tamanio(){
        return largo;
    }
    
}
