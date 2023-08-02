
package Objetos;

public class Jugador {
    
    //Atributos
    private String id;
    private int puntos;
    private int record;
    private String password;
    
    //Constructores
    public Jugador() {
    }

    public Jugador(String id, int puntos, int record, String password) {
        this.id = id;
        this.puntos = puntos;
        this.record = record;
        this.password = password;
    }
    
    
}
