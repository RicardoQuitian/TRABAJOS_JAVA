public class OperadoresDeAsignacion {
    public static void main (String args []){
        // Operadores de asignacion
        // Operador = para asignar un valor
        var miNumero = 10;
        System.out.println("Valor mi numero: " + miNumero);
        miNumero = 11;
        System.out.println("Valor mi numero: " + miNumero);
        // Operador +=
        miNumero += 5;
        System.out.println("Valor mi numero (+= 5): " + miNumero);
        // Operador -=
        miNumero -= 3;
        System.out.println("Valor mi numero (-= 3): " + miNumero);
        // Operador *=
        miNumero *= 2;
        System.out.println("Valor mi numero (*= 2): "+ miNumero);
        // Operador /=
        miNumero /= 2;
        System.out.println("Valor mi numero (/= 2) " + miNumero);
        // Operador %= Modulo o Residuo
        miNumero %= 2;
        System.out.println("Valor mi numero: " + miNumero);
    }
}
