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
    //Se creo el metodo que me vacia la cola//
//    public void VaciarCola() {
//        while (tamanio() != 0) {
//            atiendeOrden();
//        }
//    }
    //Se creo el metodo que me busca la orden que estoy solicitando//
// public boolean search(int id) {
//        // Crea una copia de la cola.
//        NodoCola_Orden aux = frente;
//        // Bandera para verificar si exist el elemento a search.
//        boolean exist = false;
//        // Recorre la pila hasta llegar encontrar el node o llegar al final
//        // de la pila.
//        while (exist != true && aux != null) {
//            // Compara si el value del node es igual que al de reference.
//            if (id == aux.getOrden().getId()) {
//                // Cambia el value de la bandera.
//                exist = true;
//            } else {
//                // Avanza al siguiente node.
//                aux = aux.getAtras();
//            }
//        }
//        // Retorna el value de la bandera.
//        return exist;
//    }
    //Se creo el metodo que atiende la orden//
//    public Orden atiendeOrden() {
//        NodoCola_Orden aux = frente;
//        Orden orden = aux.getOrden();
//        if (frente != null) {
//            frente = frente.getAtras();
//            aux.setAtras(null);
//            largo--;
//        }
//        return orden;
//    }
    //Se creo el metodo que extrae la orden//
//    public Orden extraeOrden() {
//        NodoCola_Orden aux = frente;
//        Orden orden = aux.getOrden();
//
//        return orden;
//    }
    //Se creo el metodo que me muestra la cola como String o mensaje en pantalla//
// public String mostrar_cola() {
//        String mensaje = "";
//        if (Vacia()) {
//            mensaje = "";
//        } else {
//
//            if (!Vacia()) {
//
//                NodoCola_Orden aux = frente;
//                while (aux != null) {
//                    mensaje = mensaje + aux.getOrden() + "\n\n";
//                    aux = aux.getAtras();
//                }
//            }
//        }
//        return mensaje;
//    }
}
