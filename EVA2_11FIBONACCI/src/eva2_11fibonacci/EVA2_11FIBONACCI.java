package eva2_11fibonacci;
public class EVA2_11FIBONACCI {
    public static void main(String[] args) {
        int n = 7; // Término de Fibonacci que deseas calcular
        int resultado = fibonacci(n);
    }
    public static int fibonacci(int n) {
        // Casos base
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }}