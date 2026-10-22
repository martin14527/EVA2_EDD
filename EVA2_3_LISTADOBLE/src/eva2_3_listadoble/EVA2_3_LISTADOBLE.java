package eva2_3_listadoble; //conectar nodos al inicio de la lista
//tienes que estudiar todo esto este fin de semana.

public class EVA2_3_LISTADOBLE {
    public static void main(String[] args) {
        LISTADOBLE lista = new LISTADOBLE();
        // Agregar elementos
        lista.agregar(100);
        lista.agregar(200);
        lista.agregar(300);
        lista.agregar(400);
        lista.agregar(500);
        lista.agregar(600);
        // Imprimir resultados
        System.out.print("Lista (Inicio -> Fin): ");
        lista.imprimir();
        System.out.print("Lista (Fin -> Inicio): ");
     
        lista.imprimirInverso();
        
    }
    
}
