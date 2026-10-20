
import eva2_3_listadoble.Nodo;

public class LISTADOBLE {
    private Nodo inicio;
    private Nodo fin;

    public LISTADOBLE() {
        inicio = null;
        fin = null;
    }

    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
    }

    public void imprimir() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    public void imprimirInverso() {
        Nodo actual = fin;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getPrevio();
        }
        System.out.println();
    }
}