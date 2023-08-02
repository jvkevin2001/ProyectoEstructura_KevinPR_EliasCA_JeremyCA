package Estructura.Orden;

public class Cola_Orden {

    //Se creo la clase cola_orden//
    private NodoCola_Orden frente;
    private NodoCola_Orden ultimo;
    private int largo;

    public int tamanio() {
        return largo;

    }

    //Se creo el metodo que me muestra si la orden esta vacia o no//
    public boolean Vacia() {
        return frente == null;
    }

//    public void encola(Orden orden) {
//
//        NodoCola_Orden newNodo = new NodoCola_Orden();
//        newNodo.setOrden(orden);
//
//        if (Vacia()) {
//            frente = newNodo;
//            ultimo = newNodo;
//        } else {
//            ultimo.setAtras(newNodo);
//            ultimo = newNodo;
//        }
//        largo++;
//
//    }
}
