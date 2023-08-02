package Estructura_cintaTransportadora;

import Objetos.Ingrediente;

class NodoLista_CintaTransportadora {

    private Ingrediente ingrediente;
    private NodoLista_CintaTransportadora next;

    public NodoLista_CintaTransportadora(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public NodoLista_CintaTransportadora getNext() {
        return next;
    }

    public void setNext(NodoLista_CintaTransportadora next) {
        this.next = next;
    }

    
    }


