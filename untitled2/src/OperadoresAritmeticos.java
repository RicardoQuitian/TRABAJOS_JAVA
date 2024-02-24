public class OperadoresAritmeticos {
    public static void main(String[] args) {
        // Operadores Aritmeticos
        // Suma
        var a = 1 + 2;
        System.out.println("Suma: " + a);
        // Resta
        var b = 15 - 5;
        System.out.println("Resta: " + b);
        // Multiplicación
        var c = 5 * 5;
        System.out.println("Multiplicación: " + c);
        // Division
        float d = b / 2.5F; // Tener presente, que si utilizamos un tipo flotante, al escribir los dijitos, debemos añadir F
        System.out.println("Division: " + d);
        // Modulo (residuo division)
        var f = 9 % 2;
        System.out.println("Residuo de la division: " + f);
        // Potencia
        var g = Math.pow(a,2);
        System.out.println(g);
    }
}
