package eva2_14_interactor;

import java.util.Iterator;
import java.util.LinkedList;

public class EVA2_14_INTERACTOR {

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        
        System.out.println(lista.get(2));
        
        for(int i = 0; i < 100000; i++){
            lista.add((int)(Math.random() * 100000));       
        }
        
        System.out.println("cantidad de nodos: " + lista.size());
        
        int promedio = 0;
        for(int j = 0; j < lista.size(); j++){
            promedio = promedio + lista.get(j);
        }
        System.out.println("sumatoria: " + promedio);
        
        Iterator<Integer> iterador = lista.iterator();
        while (iterador.hasNext()) {
            promedio = promedio + iterador.next();
            System.out.println("sumatoria: " + promedio/1000000000);
              System.out.println(promedio);
        }
    }
}
        
        
        

