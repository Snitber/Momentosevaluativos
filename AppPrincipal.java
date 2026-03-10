import java.util.Scanner;

public class AppPrincipal {
    public static void main(String[] args) {
        GestorPuerto control = new GestorPuerto();
        Scanner entrada = new Scanner(System.in);
        int menu = 0;

        while (menu != 5) {
            try {
                System.out.println("\n==== LOGÍSTICA JH - MENÚ PRINCIPAL ====");
                System.out.println("1. Registro de Buques [Disponibles: " + control.getEspaciosLibresBuques() + "]");
                System.out.println("2. Ubicar Contenedor");
                System.out.println("3. Peso Total");
                System.out.println("4. Listar Orígenes");
                System.out.println("5. Salir");
                System.out.print("Selección: ");
                
                menu = Integer.parseInt(entrada.nextLine());

                switch (menu) {
                    case 1 -> {
                        System.out.print("Nombre del buque: ");
                        control.registrarEntradaBuque(entrada.nextLine());
                    }
                    case 2 -> {
                        control.patio.dibujarMapa();
                        System.out.print("Columna (0-9): ");
                        int col = Integer.parseInt(entrada.nextLine());
                        System.out.print("ID: ");
                        String id = entrada.nextLine();
                        System.out.print("País: ");
                        String pais = entrada.nextLine();
                        System.out.print("Peso: ");
                        double p = Double.parseDouble(entrada.nextLine());
                        
                        if (!control.patio.apilarContenedor(col, new Contenedor(id, pais, p))) {
                            System.out.println("ADVERTENCIA: Columna llena."); 
                        }
                    }
                    case 3 -> {
                        System.out.println("Peso Total: " + control.patio.obtenerPesoTotal()); 
                    }
                    case 4 -> {
                        control.patio.listarPorOrigen();
                    }
                    case 5 -> {
                        System.out.println("Saliendo..."); 
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese datos válidos."); 
            }
        }
    }
}