import java.util.Scanner;

public class AppPrincipal {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args, int i) {
        GestorPuerto puerto = new GestorPuerto();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n===============================");
            System.out.println("   SISTEMA PORTUARIO JH");
            System.out.println("===============================");
            System.out.println("1. Registrar Buque");
            System.out.println("2. Registrar Contenedor");
            System.out.println("3. Ver Peso Total");
            System.out.println("4. Listar por Origen");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            
            opcion = sc.nextInt();
            sc.nextLine(); 

            if (i == 1) {
                System.out.print("Nombre del buque: ");
                String b = sc.nextLine();
                puerto.anclarBuque(b);
                System.out.println("\n--> ¡PRESIONE ENTER PARA VOLVER AL MENÚ!");
                sc.nextLine(); // Pausa para que veas el mensaje
            } 
            else if (opcion == 2) {
                puerto.zona.dibujarPatio();
                System.out.print("Columna (0-9): ");
                int c = sc.nextInt();
                sc.nextLine();
                
                System.out.print("ID: ");
                String id = sc.nextLine();
                System.out.print("Pais: ");
                String p = sc.nextLine();
                System.out.print("Peso: ");
                double w = sc.nextDouble();
                sc.nextLine();

                if (puerto.zona.registrarEnColumna(c, new Contenedor(id, p, w))) {
                    System.out.println("\n--> OK: Contenedor guardado en la base de la columna " + c);
                } else {
                    System.out.println("\n--> ERROR: No hay espacio arriba.");
                }
                System.out.println("--> ¡PRESIONE ENTER PARA CONTINUAR!");
                sc.nextLine();
            } 
            else if (opcion == 3) {
                System.out.println("\nRESULTADO: Peso total = " + puerto.zona.calcularPesoTotal() + " Tons.");
                System.out.println("--> ¡PRESIONE ENTER PARA VOLVER!");
                sc.nextLine();
            } 
            else if (opcion == 4) {
                puerto.zona.reportePorPais();
                System.out.println("\n--> ¡PRESIONE ENTER PARA VOLVER!");
                sc.nextLine();
            }
        }
        System.out.println("Aplicacion cerrada por el usuario.");
        sc.close();
    }
}