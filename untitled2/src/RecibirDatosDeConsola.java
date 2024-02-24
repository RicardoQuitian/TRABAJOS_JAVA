import java.util.Scanner;
public class RecibirDatosDeConsola {
    // Accedemos a la consola
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        // Leer valores
        System.out.print("proporciona tu nombre ");
        var nombre = consola.nextLine();
        System.out.println("proporciona tu edad ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.println("proporciona tu sueldo (USD)" );
        var sueldo = Float.parseFloat(consola.nextLine());
        System.out.println("Eres un empleado de confianza (true/folse) ");
        var empleadoDeConfianza = Boolean.parseBoolean(consola.nextLine());
        // Imprimir los valores
        System.out.println("La información proporcionada es: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("sueldo: " + sueldo);
        System.out.println("¿Empleado de confianza?: " + empleadoDeConfianza );


    }
}
