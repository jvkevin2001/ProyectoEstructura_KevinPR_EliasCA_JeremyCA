
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
    
    //Getters
    public String getId() {
        return id;
    }
    public int getPuntos() {
        return puntos;
    }
    public int getRecord() {
        return record;
    }
    public String getPassword() {
        return password;
    }
    
    //setters
    public void setId(String id) {
        this.id = id;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public void setRecord(int record) {
        this.record = record;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
