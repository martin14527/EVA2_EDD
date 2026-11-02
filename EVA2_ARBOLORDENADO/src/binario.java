package eva2_arbolordenado;

public class binario {
    private Nodo root;

    public binario() {
        this.root = null;
    }

    public void agregar(int valor) {
        if (this.root == null) {
            this.root = new Nodo(valor);
        } else {
            agregarRecu(this.root, valor);
        }
    }

    private void agregarRecu(Nodo actual, int valor) {
        if (valor < actual.getDato()) {
            if (actual.getIzquierdo() == null) {
                actual.setIzquierdo(new Nodo(valor));
            } else {
                agregarRecu(actual.getIzquierdo(), valor);
            }
        } else if (valor > actual.getDato()) {
            if (actual.getDerecho() == null) {
                actual.setDerecho(new Nodo(valor));
            } else {
                agregarRecu(actual.getDerecho(), valor);
            }
        }
        // Si el valor ya existe en el árbol, no se hace nada (evita duplicados)
    }
}                                                                                                                                                                                               