package Estructura_cintaTransportadora;

import Objetos.Ingrediente;

public class Lista_cintaTransportadora {
    //atributos//

    private NodoLista_CintaTransportadora cabeza;
    private NodoLista_CintaTransportadora ultimo;
    private int largo;
    private boolean disponible = true;

    public boolean disponible() {
        return disponible;
    }

    public int tamanio() {
        return largo;
    }

    public boolean vacia() {
        boolean vacia = false;
        if (cabeza == null) {
            vacia = true;
        }
        return vacia;
    }

    public void insertar(Ingrediente ingrediente) {
        if (disponible == true) {
            if (cabeza == null) {
                cabeza = new NodoLista_CintaTransportadora(ingrediente);
                cabeza.setNext(cabeza);

                ultimo = cabeza;
                ultimo.setNext(cabeza);
            } else {
                NodoLista_CintaTransportadora aux = new NodoLista_CintaTransportadora(ingrediente);
                //ultimo setnext aux
                ultimo.setNext(aux);

                //ultimo es aux
                ultimo = aux;
                //ultimo set next cabeza
                ultimo.setNext(cabeza);

            }

            largo++;
            if (tamanio() == 5) {
                disponible = false;
            }
        }

    }

    public void clean() {
        if (cabeza != null) {
            cabeza = cabeza.getNext();
            ultimo.setNext(cabeza);
            if (cabeza == ultimo) {
                cabeza = null;
                ultimo = null;
            }
        }
    }

    public void elimina(int id) {
        if (cabeza != null) {
            if (cabeza.getIngrediente().getId() == id) {
                cabeza = cabeza.getNext();
                ultimo.setNext(cabeza);
            } else {
                NodoLista_CintaTransportadora aux = cabeza;
                while (aux.getNext().getIngrediente().getId() != id) {
                    aux = aux.getNext();
                }
                if (aux.getNext() == ultimo) {
                    ultimo = aux;
                    ultimo.setNext(cabeza);
                } else {
                    aux.setNext(aux.getNext().getNext());
                }

            }
            largo--;
            disponible = false;
        }
        if (tamanio() == 3) {
            disponible = true;
        }

    }
    
    public boolean buscarId(int id) {
        boolean exist = false;
        boolean seguir = true;

        if (cabeza.getIngrediente().getId() == id) {
            exist = true;
        } else {
            if (tamanio() != 1) {
                NodoLista_CintaTransportadora aux = cabeza;
                
              
                while (aux.getIngrediente().getId() != id && seguir == true) {
                    aux = aux.getNext();
                    if(aux == ultimo){
                        seguir =false;
                    }

                }
                if (aux.getIngrediente().getId() == id) {
                    exist = true;
                }
            }

        }
        return exist;
    }
    
}
