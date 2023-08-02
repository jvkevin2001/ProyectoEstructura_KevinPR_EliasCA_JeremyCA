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
    
    //Existe el nodo
    public boolean exist (String ingrediente) {
        // Crea una copia de la pila.
        Nodo_Pila_Ingrediente aux = cima;
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el nodo o llegar al final
        // de la cola
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de referencia
            if (ingrediente.equals(aux.getIngrediente().getNombre()) ) {
                // Cambia el valor de la bandera si lo encuentra
                exist = true;
            } else {
                // Avanza al siguiente node si no lo encuentra
                aux = aux.getSiguiente();
            }
        }
        return exist;
    }
    
    //TraerIngrediente
    public Ingrediente traerIngrediente(String nombre) {
        Ingrediente ingrediente = new Ingrediente();
        // Crea una copia de la pila.
        Nodo_Pila_ingrediente aux = cima;
        // Bandera para verificar si existe el elemento a search.

        while (aux != null) {
            // Compara si el value del node es igual que al de referencia
            if (nombre.equals(aux.getIngrediente().getNombre())) {

                ingrediente = aux.getIngrediente();
                aux = null;
            } else {
                // Avanza al siguiente node si no lo encuentra
                aux = aux.getSiguiente();
            }
        }
        // Retorna el valor de la bandera
        return ingrediente;
    }
}
