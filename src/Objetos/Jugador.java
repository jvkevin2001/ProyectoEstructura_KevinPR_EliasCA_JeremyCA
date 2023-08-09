
package Objetos;

public class Jugador {
    
    //Atributos
    private String id;
    private int puntos;
    private int record;
    private String password;
    private String correo;
    //Constructores
    public Jugador() {
    }

    public Jugador(String id, int puntos, int record, String password, String correo) {
        this.id = id;
        this.puntos = puntos;
        this.record = record;
        this.password = password;
        this.correo = correo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", puntos=" + puntos + ", record=" 
                + record + ", password=" + password +
                ", correo=" + correo + '}';
    }

   
    
    
}
