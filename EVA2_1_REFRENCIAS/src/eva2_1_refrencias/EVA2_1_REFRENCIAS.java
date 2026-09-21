/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_refrencias;

/**
 *
 * @author anoni
 */
public class EVA2_1_REFRENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejemplo inicio;
        inicio = new ejemplo();
        inicio.valor =100;
        System.out.println("inicio " + valor);
         System.out.println("inicio " + inicio.otro);
         System.out.println("inicio otro " + inicio.otro);
         //crear una lista
         inicio.otro = new ejemplo();
         inicio.otro.valor = 200;
         inicio.otro.otro.valor = 300 //encadenas listas de forma artesanal.
         inicio.otro.otro.otro.valor = 400;
         ejemplo sig = inicio;
         while(sig ! = null){
     System.out.println(sig.otro + " k");
    
    };
    } 
    class ejemplo {
    int valor;
    ejemplo otro;
    
    }
}
