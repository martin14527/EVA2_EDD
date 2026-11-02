package eva2_7_grafos;

class Nodo<T> {
    private T dato;
    private Nodo<T> siguiente;
    private Nodo<T> previo;
    public Nodo(T dato) { //la lista debe ser generica,para poder guardar cualquier tipo de dato
        this.dato = dato;
    }
    public T getDato() { return dato; }
    public Nodo<T> getSiguiente() { return siguiente; }
    public Nodo<T> getPrevio() { return previo; }
    public void setSiguiente(Nodo<T> siguiente) { this.siguiente = siguiente; }
    public void setPrevio(Nodo<T> previo) { this.previo = previo; }
}
public class ListaDoble<T> {
    private Nodo<T> inicio;
    private Nodo<T> fin;
    private int tamano;
    public void agregar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }  tamano++;
    }

    public void insertar(T dato) {          // al inicio
        Nodo<T> nuevo = new Nodo<>(dato);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setPrevio(nuevo);
            inicio = nuevo;
        }
        tamano++;
    }

    public void imprimir() {
        Nodo<T> actual = inicio;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    public void imprimirInverso() {
        Nodo<T> actual = fin;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getPrevio();
        }
        System.out.println();
    }

    public void borrarEn(int posicion) {
        if (posicion < 0 || posicion >= tamano) {
            return;
        }

        if (posicion == 0) {
            inicio = inicio.getSiguiente();
            if (inicio == null) {
                fin = null;
            } else {
                inicio.setPrevio(null);
            }
        } else {
            Nodo<T> anterior = inicio;
            for (int i = 0; i < posicion - 1; i++) {
                anterior = anterior.getSiguiente();
            }
            Nodo<T> borrar = anterior.getSiguiente();
            Nodo<T> despues = borrar.getSiguiente();

            anterior.setSiguiente(despues);
            if (despues == null) {
                fin = anterior;
            } else {
                despues.setPrevio(anterior);
            }
        }
        tamano--;
    }
}