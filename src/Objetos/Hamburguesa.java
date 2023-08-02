
package Objetos;


public class Hamburguesa {
    //Atributos
    private String tipo;
    private Pila_Ingrediente pila_ingredientes = new Pila_Ingrediente();
    private int puntos;
    
    //Constructor
    public Hamburguesa(String tipo, int puntos) {
        this.tipo = tipo;
        this.puntos = puntos;
    }
    
}
