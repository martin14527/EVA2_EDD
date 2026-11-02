
package eva2_10mcd;

/* @author anoni
 */
public class EVA2_10MCD {

    public static void main(String[] args) {
        int n1 = 9;
        int n2 = 6;

        int resultado = calcularMCD(n1, n2);
        System.out.println("El MCD de " + n1 + " y " + n2 + " es: " + resultado);
    }

    /**
     * Método recursivo para obtener el MCD
     */
    public static int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        }
   
        return calcularMCD(b, a % b);
    }
}
