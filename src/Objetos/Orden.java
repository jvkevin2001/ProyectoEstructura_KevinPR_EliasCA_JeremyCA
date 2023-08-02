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

   

}
