import java.util.Scanner;

public class AppPrincipal {
    public static void main(String[] args) {
        // Inicialización de la lógica del puerto
        GestorPuerto puerto = new GestorPuerto();
        Scanner teclado = new Scanner(System.in);
        int seleccion = 0;

        // Bucle que mantiene la app abierta hasta elegir la opción 5 
        do {
            System.out.println("\n--- LOGÍSTICA PORTUARIA JH ---");
            System.out.println("1. Registrar Entrada de Buque");
            System.out.println("2. Ubicar Contenedor en Patio");
            System.out.println("3. Consultar Peso Total");
            System.out.println("4. Listar por País de Origen");
            System.out.println("5. Finalizar Programa");
            System.out.print("Elija una opción: ");
            
            seleccion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer

            // Opción 1: Registro de Buques en el array de 10 [cite: 23, 33]
         
            if (seleccion == 1) {
                System.out.print("Nombre o ID del Buque: ");
                String nombreB = teclado.nextLine();
                puerto.anclarBuque(nombreB);
            } 
            
            // Opción 2: Registro de Contenedores en matriz 10x10 [cite: 22, 34, 41]
            else if (seleccion == 2) {
                // Mostrar esquema de puestos disponibles antes de ingresar 
                puerto.zona.dibujarPatio();
                
                System.out.print("¿En qué columna lo apilará? (0-9): ");
                int col = teclado.nextInt();
                teclado.nextLine(); 
                
                System.out.print("ID del contenedor: ");
                String idC = teclado.nextLine();
                System.out.print("País de procedencia: ");
                String paisC = teclado.nextLine();
                System.out.print("Peso en Toneladas: ");
                double pesoC = teclado.nextDouble();
                teclado.nextLine();

                // Lógica para apilar de abajo hacia arriba (no aire) [cite: 24]
                if (puerto.zona.registrarEnColumna(col, new Contenedor(idC, paisC, pesoC))) {
                    System.out.println(">>> Contenedor ubicado con éxito.");
                } else {
                    // Advertencia si el puesto está ocupado o lleno 
                    System.out.println(">>> ADVERTENCIA: La columna " + col + " no tiene espacio.");
                }
            } 
            
            // Opción 3: Peso total de los contenedores [cite: 35]
            else if (seleccion == 3) {
                double total = puerto.zona.calcularPesoTotal();
                System.out.println(">>> Peso total actual en patio: " + total + " kg.");
            } 
            
            // Opción 4: Listado agrupado por origen [cite: 36]
            else if (seleccion == 4) {
                System.out.println("--- LISTADO DE CONTENEDORES ---");
                puerto.zona.reportePorPais();
            }
            
            // Opción de salida 
            else if (seleccion == 5) {
                System.out.println("Cerrando sistema JH...");
            }
            
            else {
                System.out.println("Opción no válida.");
            }

        } while (seleccion != 5);
        
        teclado.close(); // Cierre de recurso
    }
}