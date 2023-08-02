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
    
    //Search
    public boolean searchAgregado(String ingrediente) {
        Nodo_Pila_Ingrediente aux = cima;
        boolean exist = false;
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de referencia
            if (ingrediente.equals(aux.getIngrediente().getNombre())
                    && aux.getIngrediente().isAgregado()) {
                exist = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return exist;
    }
}
