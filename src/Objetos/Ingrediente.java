
package Objetos;

public class Ingrediente {
    
//Atributos
private int id;
private String nombre;
private boolean agregado;
   
//Constructores
    public Ingrediente() {
    }
    
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
    
//Setter
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }
    
@Override
    public String toString() {
        return nombre ;
    }
    

}
