package Estructura_Pila_Ingredientes;

import Objetos.Ingrediente;

public class Nodo_Pila_Ingrediente {
    
//Atributos
private Ingrediente ingrediente;
private Nodo_Pila_Ingrediente siguiente;

//Contructor
    public Nodo_Pila_Ingrediente() {
        this.ingrediente = null;
        this.siguiente = null;
    }

//getter
    public Ingrediente getIngrediente() {
        return ingrediente;
    }
    public Nodo_Pila_Ingrediente getSiguiente() {
        return siguiente;
    }
    
    

}
