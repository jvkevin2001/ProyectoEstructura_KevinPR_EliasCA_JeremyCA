package Estructura.Orden;

import Objetos.Orden;

public class Cola_Orden_Finalizada {
    
    //Atributos
    private NodoCola_Orden_Finalizada frente;
    private NodoCola_Orden_Finalizada ultimo;
    private int largo;
    
    //Metodo tamanio
    public int tamanio(){
        return largo;
    }
    
    //Metodo Vacia
    public boolean Vacia() {
        return frente == null;
    }
    
    //Metodo Encola
    public void encola(Orden orden) {
        NodoCola_Orden_Finalizada newNodo = new NodoCola_Orden_Finalizada();
        newNodo.setOrden(orden);
        
        if (Vacia()) {
            frente = newNodo;
            ultimo = newNodo;
        } else {
            ultimo.setAtras(newNodo);
            ultimo = newNodo;
        }
        largo++;
    } 
    
    //Metodo Mostrar
    public String mostrar_cola() {
        String mensaje = "";
        if (Vacia()) {
            mensaje = "";
        } else {

            if (!Vacia()) {

                NodoCola_Orden_Finalizada aux = frente;
                while (aux != null) {
                    mensaje = mensaje + aux.getOrden() + "\n\n";
                    aux = aux.getAtras();
                }
            }
        }
        return mensaje;
    }   
}
