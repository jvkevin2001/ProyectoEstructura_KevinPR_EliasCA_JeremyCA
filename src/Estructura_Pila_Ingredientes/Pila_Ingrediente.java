package Estructura_Pila_Ingredientes;

import Objetos.Ingrediente;

public class Pila_Ingrediente {
    
    //Atributos 
    private Nodo_Pila_Ingrediente cima; 
    private int largo;
   
    //Metodo Vacia
    public boolean Vacia() {
        return cima == null;
    }
    
   
}
