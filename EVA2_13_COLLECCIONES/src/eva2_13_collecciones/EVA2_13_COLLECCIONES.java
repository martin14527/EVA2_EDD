package eva2_13_collecciones;

import java.util.ArrayList;  // Importación necesaria para ArrayList
import java.util.LinkedList; // Importación necesaria para LinkedList
import java.util.PriorityQueue;
import java.util.Queue;

public class EVA2_13_COLLECCIONES {

    public static void main(String[] args) {
        // --- LinkedList ---
        LinkedList<Integer> lista = new LinkedList<Integer>();
        
        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        
        System.out.println(lista);
        
        ArrayList<String> arrayList = new ArrayList<String>();
        
        arrayList.add("hola");
        arrayList.add("holas");
        arrayList.add("holass");
        System.out.println(arrayList);
       Queue<Integer> queue = new PriorityQueue<>();
        queue.add(200); 
              queue.add(230);
                    queue.add(400);
                          queue.add(900);
                          System.out.println(queue);
    }
}