package eva2_3_listadoble;

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
    private int tamano;   // mejor declararlo arriba, junto con inicio y fin

public void agregarw(int dato) {
    Nodo nuevo = new Nodo(dato);
    if (inicio == null) {
        inicio = nuevo;
        fin = nuevo;
    } else {
        fin.setSiguiente(nuevo);
        nuevo.setPrevio(fin);
        fin = nuevo;
    }
    tamano++;                       
}

public void insertar(int valor) {   // inserta al inicio
    Nodo nuevo = new Nodo(valor);
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

public void borrarEn(int posicion) {
    if (posicion < 0 && posicion >= tamano) {   
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
        Nodo anterior = inicio;
        for (int i = 0; i < posicion - 1; i++) {
            anterior = anterior.getSiguiente();
        }
        Nodo borrar = anterior.getSiguiente();
        Nodo despues = borrar.getSiguiente();

        anterior.setSiguiente(despues);
        if (despues == null) {
            fin = anterior;         
        } else {
            despues.setPrevio(anterior);
        }
    }
    tamano--;
}}