
package eva2_7_grafos;

public class EVA2_7_GRAFOS {

    public static void main(String[] args) {
        ListaDoble<Integer> lista = new ListaDoble<>(); //integer seria como un entero para nodos,
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.insertar(5);       
        lista.imprimir();         
        lista.imprimirInverso(); 
        lista.borrarEn(1);       
        lista.imprimir();         
    }
}