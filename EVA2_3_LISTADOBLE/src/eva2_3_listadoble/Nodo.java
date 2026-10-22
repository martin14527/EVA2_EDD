package eva2_3_listadoble;

public class Nodo {
    private int dato;
    private Nodo siguiente;
    private Nodo previo;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.previo = null;
    }

    public int getDato() {
        return dato;
    }
    
    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
}