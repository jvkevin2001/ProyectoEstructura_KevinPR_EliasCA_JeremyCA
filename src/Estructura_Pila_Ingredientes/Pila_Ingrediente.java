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
    
    //tamanio pila
    public int tamanio() {
        return this.largo;
    }
    
   //Push
    public void push(Ingrediente ingrediente) {
        Nodo_Pila_Ingrediente newNodo = new Nodo_Pila_Ingrediente();
        newNodo.setIngrediente(ingrediente);

        if (Vacia()) {
            cima = newNodo;
        } else {
            newNodo.setSiguiente(cima);
            cima = newNodo;
        }
        largo++;
    }
}
