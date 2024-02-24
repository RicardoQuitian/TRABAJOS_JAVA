public class DecrementoIncremento {

    public static void main(String args[]) {
        // Operadores de Incremento
        var a = 0;
        // Operador post-incremento
        System.out.println("Antes de incrementar: " + a);
        a++; // Indica que en la proxima linea que se llame la variable a, incrementara 1
        System.out.println("Despues de incrementar a++: " + a);
        // Operador pre-incremento
        var b = 15;
        System.out.println("Antes de incrementar (b=15): " + b);
        ++b; // En esta misma linea se incremento 1 a la variable v
        System.out.println("Despues de incrementar (b=15): " + b);
        // Operador Decremento
        // Post-decremento
        a = 10;
        System.out.println("Antes de Decrementar: " + a);
        a--;
        System.out.println("Despues de Decrementar: " + a);
        // Pre-decremento
        a = 50;
        System.out.println("Antes del Pre_decremento: " + a);
        --a;
        System.out.println("Despues del Pre-decremento: " + a );
    }
}