package eva2_3_listadoble;

public class EVA2_4_QUESES_STACK {

    private LISTADOBLE lista;

    public EVA2_4_QUESES_STACK() {
        lista = new LISTADOBLE();
    }

    public void push(int valor) {
        lista.insertar(valor);               // al inicio
    }

    public int peek() {
        if (lista.estaVacia()) {
            throw new RuntimeException("La pila esta vacia");
        }
        return lista.obtenerPrimero();
    }

    public int pop() {
        if (lista.estaVacia()) {
            throw new RuntimeException("La pila esta vacia");
        }
        int valor = lista.obtenerPrimero();
        lista.borrarEn(0);
        return valor;
    }

    public boolean estaVacia() {
        return lista.estaVacia();
    }

    public void imprimir() {
        lista.imprimir();
    }
}