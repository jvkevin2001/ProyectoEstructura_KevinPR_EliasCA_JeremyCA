package Objetos;

public class Orden {

    //Creacion de la clase Orden y sus atributos//
    private int id;
    private Hamburguesa hamburguesa;
    private Pila_ingredienteAgregado pila_ingredienteAgregado
            = new Pila_ingredienteAgregado();
    private boolean finalizada;

    //Creacion del constructor vacio de la clase orden//
    public Orden() {
    }

    //Se creo constructor lleno//
    
    
    public Orden(int id, Hamburguesa hamburguesa, boolean finalizada) {
        this.id = id;
        this.hamburguesa = hamburguesa;
        this.finalizada = finalizada;
    }

   //Creacion de los getters and setters//
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }

    public void setHamburguesa(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    public Pila_ingredienteAgregado getPila_ingredienteAgregado() {
        return pila_ingredienteAgregado;
    }

    public void setPila_ingredienteAgregado(Pila_ingredienteAgregado pila_ingredienteAgregado) {
        this.pila_ingredienteAgregado = pila_ingredienteAgregado;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    //Se creo el toString que mu muestra en pantalla la orden//
    
    @Override
    public String toString() {
        return "Orden{" + "id=" + id + ", hamburguesa=" + hamburguesa 
                + ", pila_ingredienteAgregado=" + pila_ingredienteAgregado 
                + ", finalizada=" + finalizada + '}';
    }

   

}
