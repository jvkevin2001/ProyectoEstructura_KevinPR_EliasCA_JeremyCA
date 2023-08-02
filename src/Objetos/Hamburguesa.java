package Objetos;

import Estructura_Pila_Ingredientes.Pila_Ingrediente;


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
    
    //Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setPila_ingredientes(Pila_Ingrediente pila_ingredientes) {
        this.pila_ingredientes = pila_ingredientes;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    //Getters
    public String getTipo() {
        return tipo;
    }
    public Pila_Ingrediente getPila_ingredientes() {
        return pila_ingredientes;
    }
    public int getPuntos() {
        return puntos;
    }
    
   //ToString
    @Override
    public String toString() {
        return  tipo + " pila_ingredientes=" 
                + pila_ingredientes + ", puntos=" + puntos + '}';
    }
    
    
    
    
}
