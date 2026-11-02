package eva2_9_factorial;
//se resuelve paso paso, cada recursividad resuelve 1 problema.
public class EVA2_9_FACTORIAL {

    public static void main(String[] args) {
        int n = 5;
        
        System.out.println("Factorial (Iterativo) de " + n + ": " + calcularFactorialCiclo(n));
        System.out.println("Factorial (Recursivo) de " + n + ": " + calcularFactorialRecu(n));
    }
    public static int calcularFactorialCiclo(int numero) {
        int acumulador = 1;
        for (int i = numero; i > 0; i--) {
            acumulador *= i; // Equivale a: acumulador = acumulador * i
        }
        return acumulador;
    }

    public static int calcularFactorialRecu(int numero) {
        
        if (numero <= 1) {
            return 1;
        }
        // Paso recursivo: n! = n * (n - 1)!
        return numero * calcularFactorialRecu(numero - 1);
    }
}