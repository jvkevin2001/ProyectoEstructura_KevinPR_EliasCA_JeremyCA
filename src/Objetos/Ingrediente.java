
package Objetos;

public class Ingrediente {
    
//Atributos
private int id;
private String nombre;
private boolean agregado;
   
//Constructor
    public Ingrediente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.agregado= false;
    }

//getter
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public boolean isAgregado() {
        return agregado;
    }
    

}
