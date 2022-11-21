import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vehiculo vehiculo1 = new vehiculo();
        vehiculo vehiculo2 = new vehiculo();
        vehiculo vehiculo3 = new vehiculo();
        vehiculo vehiculo4 = new vehiculo();
        vehiculo vehiculo5 = new vehiculo();
    }
    static void mostrarMenuPrincipal(){
        System.out.println("\n\t *** MENÚ PRINCIPAL ***");
        System.out.println("A. Configurar datos del vehiculo 1.");
        System.out.println("B. Configurar datos del vehiculo 2.");
        System.out.println("C. Configurar datos del vehiculo 3.");
        System.out.println("D. Configurar datos del vehiculo 4.");
        System.out.println("E. Configurar datos del vehiculo 5.");
        System.out.println("F. Mostrar datos de los vehiculos.");
        System.out.println("G. Salir");
    }
}
