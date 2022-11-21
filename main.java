import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vehiculo vehiculo1 = new vehiculo();
        vehiculo vehiculo2 = new vehiculo();
        vehiculo vehiculo3 = new vehiculo();
        vehiculo vehiculo4 = new vehiculo();
        vehiculo vehiculo5 = new vehiculo();
        String opcionMenuPrincipal;
        boolean opcionContinuar;
        do {
            mostrarMenuPrincipal();
            System.out.print("\nElija una opción: ");
            opcionMenuPrincipal = sc.next().toUpperCase();
            opcionContinuar = true;
            switch (opcionMenuPrincipal){
                case "A":
                    System.out.println("\t VEHICULO 1:");
                    System.out.print("Ingrese el color: ");
                    sc.nextLine();
                    vehiculo1.setColor(sc.nextLine());
                    System.out.print("Ingrese la marca: ");
                    vehiculo1.setMarca(sc.nextLine());
                    System.out.print("Ingrese el modelo: ");
                    vehiculo1.setModelo(sc.nextLine());
                    System.out.print("Ingrese el tipo de motor: ");
                    vehiculo1.setTipoMotor(sc.nextLine());
                    System.out.print("Ingrese los litros del motor: ");
                    vehiculo1.setLitrosMotor(sc.nextDouble());
                    System.out.print("Ingrese el rendimiento del motor en km/l: ");
                    vehiculo1.setRendimientoMotor(sc.nextDouble());
                    break;
                case "B":
                    System.out.println("\t VEHICULO 2:");
                    System.out.print("Ingrese el color: ");
                    sc.nextLine();
                    vehiculo2.setColor(sc.nextLine());
                    System.out.print("Ingrese la marca: ");
                    vehiculo2.setMarca(sc.nextLine());
                    System.out.print("Ingrese el modelo: ");
                    vehiculo2.setModelo(sc.nextLine());
                    System.out.print("Ingrese el tipo de motor: ");
                    vehiculo2.setTipoMotor(sc.nextLine());
                    System.out.print("Ingrese los litros del motor: ");
                    vehiculo2.setLitrosMotor(sc.nextDouble());
                    System.out.print("Ingrese el rendimiento del motor en km/l: ");
                    vehiculo2.setRendimientoMotor(sc.nextDouble());
                    break;
                case "C":
                    System.out.println("\t VEHICULO 3:");
                    System.out.print("Ingrese el color: ");
                    sc.nextLine();
                    vehiculo3.setColor(sc.nextLine());
                    System.out.print("Ingrese la marca: ");
                    vehiculo3.setMarca(sc.nextLine());
                    System.out.print("Ingrese el modelo: ");
                    vehiculo3.setModelo(sc.nextLine());
                    System.out.print("Ingrese el tipo de motor: ");
                    vehiculo3.setTipoMotor(sc.nextLine());
                    System.out.print("Ingrese los litros del motor: ");
                    vehiculo3.setLitrosMotor(sc.nextDouble());
                    System.out.print("Ingrese el rendimiento del motor en km/l: ");
                    vehiculo3.setRendimientoMotor(sc.nextDouble());
                    break;
                case "D":
                    System.out.println("\t VEHICULO 4:");
                    System.out.print("Ingrese el color: ");
                    sc.nextLine();
                    vehiculo4.setColor(sc.nextLine());
                    System.out.print("Ingrese la marca: ");
                    vehiculo4.setMarca(sc.nextLine());
                    System.out.print("Ingrese el modelo: ");
                    vehiculo4.setModelo(sc.nextLine());
                    System.out.print("Ingrese el tipo de motor: ");
                    vehiculo4.setTipoMotor(sc.nextLine());
                    System.out.print("Ingrese los litros del motor: ");
                    vehiculo4.setLitrosMotor(sc.nextDouble());
                    System.out.print("Ingrese el rendimiento del motor en km/l: ");
                    vehiculo4.setRendimientoMotor(sc.nextDouble());
                    break;
                case "E":
                    System.out.println("\t VEHICULO 5:");
                    System.out.print("Ingrese el color: ");
                    sc.nextLine();
                    vehiculo5.setColor(sc.nextLine());
                    System.out.print("Ingrese la marca: ");
                    vehiculo5.setMarca(sc.nextLine());
                    System.out.print("Ingrese el modelo: ");
                    vehiculo5.setModelo(sc.nextLine());
                    System.out.print("Ingrese el tipo de motor: ");
                    vehiculo5.setTipoMotor(sc.nextLine());
                    System.out.print("Ingrese los litros del motor: ");
                    vehiculo5.setLitrosMotor(sc.nextDouble());
                    System.out.print("Ingrese el rendimiento del motor en km/l: ");
                    vehiculo5.setRendimientoMotor(sc.nextDouble());
                    break;
                case "F":
                    System.out.println("\n\t *** MOSTRANDO DATOS INGRESADOS ***");
                    System.out.println("\n\t VEHICULO 1:");
                    System.out.println("Color: " + vehiculo1.getColor());
                    System.out.println("Marca: " + vehiculo1.getMarca());
                    System.out.println("Modelo: " + vehiculo1.getModelo());
                    System.out.println("Tipo de motor: " + vehiculo1.getTipoMotor());
                    System.out.println("Litros del motor: " + vehiculo1.getLitrosMotor());
                    System.out.println("Rendimiento del motor en km/l: " + vehiculo1.getRendimientoMotor());
                    System.out.println("\n\t VEHICULO 2:");
                    System.out.println("Color: " + vehiculo2.getColor());
                    System.out.println("Marca: " + vehiculo2.getMarca());
                    System.out.println("Modelo: " + vehiculo2.getModelo());
                    System.out.println("Tipo de motor: " + vehiculo2.getTipoMotor());
                    System.out.println("Litros del motor: " + vehiculo2.getLitrosMotor());
                    System.out.println("Rendimiento del motor en km/l: " + vehiculo2.getRendimientoMotor());
                    System.out.println("\n\t VEHICULO 3:");
                    System.out.println("Color: " + vehiculo3.getColor());
                    System.out.println("Marca: " + vehiculo3.getMarca());
                    System.out.println("Modelo: " + vehiculo3.getModelo());
                    System.out.println("Tipo de motor: " + vehiculo3.getTipoMotor());
                    System.out.println("Litros del motor: " + vehiculo3.getLitrosMotor());
                    System.out.println("Rendimiento del motor en km/l: " + vehiculo3.getRendimientoMotor());
                    System.out.println("\n\t VEHICULO 4:");
                    System.out.println("Color: " + vehiculo4.getColor());
                    System.out.println("Marca: " + vehiculo4.getMarca());
                    System.out.println("Modelo: " + vehiculo4.getModelo());
                    System.out.println("Tipo de motor: " + vehiculo4.getTipoMotor());
                    System.out.println("Litros del motor: " + vehiculo4.getLitrosMotor());
                    System.out.println("Rendimiento del motor en km/l: " + vehiculo4.getRendimientoMotor());
                    System.out.println("\n\t VEHICULO 5:");
                    System.out.println("Color: " + vehiculo5.getColor());
                    System.out.println("Marca: " + vehiculo5.getMarca());
                    System.out.println("Modelo: " + vehiculo5.getModelo());
                    System.out.println("Tipo de motor: " + vehiculo5.getTipoMotor());
                    System.out.println("Litros del motor: " + vehiculo5.getLitrosMotor());
                    System.out.println("Rendimiento del motor en km/l: " + vehiculo5.getRendimientoMotor());
                    break;
                case "G":
                    opcionContinuar = false;
                    break;
            }
        } while (opcionContinuar);
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
