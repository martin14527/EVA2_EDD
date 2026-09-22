package eva2_1_refrencias;

public class EVA2_1_REFRENCIAS {

    public static void main(String[] args) {

        ejemplo inicio;
        inicio = new ejemplo();

        inicio.valor = 100;

        System.out.println("inicio " + inicio.valor);
        System.out.println("inicio otro " + inicio.otro);

        // Crear una lista
        inicio.otro = new ejemplo();
        inicio.otro.valor = 200;

        inicio.otro.otro = new ejemplo();
        inicio.otro.otro.valor = 300;

        inicio.otro.otro.otro = new ejemplo();
        inicio.otro.otro.otro.valor = 400;

        // Recorrer la lista
        ejemplo sig = inicio;

        while (sig != null) {
            System.out.println(sig.valor + " k");
            sig = sig.otro;
        }
    }

    static class ejemplo {
        int valor;
        ejemplo otro;
    }
}
