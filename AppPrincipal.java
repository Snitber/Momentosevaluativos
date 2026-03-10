import java.util.Scanner;

public class AppPrincipal {
    public static void main(String[] args) {
        GestorPuerto puerto = new GestorPuerto();
        try (Scanner sc = new Scanner(System.in)) {
            var opcion = 0;

            while (opcion != 5) {
                System.out.println("\n--- GESTION PORTUARIA JH ---");
                System.out.println("1. Registrar Buque");
                System.out.println("2. Registrar Contenedor");
                System.out.println("3. Ver Peso Total");
                System.out.println("4. Listar por Origen");
                System.out.println("5. Salir");
                System.out.print("Elija una opcion: ");
                
                // Usamos una validación simple para la opción
                if (sc.hasNextInt()) {
                    opcion = sc.nextInt();
                    sc.nextLine(); 

                    if (opcion != 1) if (opcion == 2) {
                        puerto.zona.dibujarPatio();
                        System.out.print("Columna (0-9): ");
                        int col = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.print("ID Contenedor: ");
                        String id = sc.nextLine();
                        System.out.print("Pais: ");
                        String pais = sc.nextLine();
                        System.out.print("Peso: ");
                        double peso = sc.nextDouble();
                        sc.nextLine();

                        if (puerto.zona.registrarEnColumna(col, new Contenedor(id, pais, peso))) {
                            System.out.println("LOGRADO: Contenedor guardado.");
                        } else {
                            System.out.println("ADVERTENCIA: Columna llena.");
                        }
                    } 
                    else if (opcion == 3) {
                        System.out.println("Peso total: " + puerto.zona.calcularPesoTotal() + " Tons.");
                    } 
                    else if (opcion == 4) {
                        puerto.zona.reportePorPais();
                    } 
                    else if (opcion == 5) {
                        System.out.println("Cerrando...");
                    } 
                    else {
                        System.out.print("Nombre del buque: ");
                        String nombre = sc.nextLine();
                        puerto.anclarBuque(nombre);
                    }
                } else {
                    System.out.println("Error: Ingrese solo numeros.");
                    sc.nextLine(); // Limpia el error
                }
            }
            // Esto quita el aviso amarillo del Scanner
            sc.close();
        } 
    }
}