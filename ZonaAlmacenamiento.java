public class ZonaAlmacenamiento {
    private Contenedor[][] patio = new Contenedor[10][10];

    // Muestra el esquema básico de puestos disponibles 
    public void dibujarMapa() {
        System.out.println("\n--- ESTADO DEL PATIO (Fila 0 es la cima, Fila 9 es el suelo) ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("F" + i + " | ");
            for (int j = 0; j < 10; j++) {
                System.out.print(patio[i][j] == null ? "[  ] " : "[XX] ");
            }
            System.out.println();
        }
        System.out.println("      0    1    2    3    4    5    6    7    8    9 (Columnas)");
    }

    public boolean apilarContenedor(int columna, Contenedor c) {
        // Validación: No deben existir solapamientos [cite: 49]
        // Se busca desde la fila 9 hasta la 0 para apilar correctamente 
        for (int fila = 9; fila >= 0; fila--) {
            if (patio[fila][columna] == null) {
                patio[fila][columna] = c;
                return true;
            }
        }
        return false; // Columna llena
    }

    public double obtenerPesoTotal() {
        double total = 0;
        for (Contenedor[] fila : patio) {
            for (Contenedor c : fila) {
                if (c != null) total += c.getMasa();
            }
        }
        return total;
    }

    public void listarPorOrigen() {
        System.out.println("\n--- LISTADO AGRUPADO POR ORIGEN ---");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (patio[i][j] != null) {
                    System.out.println("Origen: " + patio[i][j].getPaisOrigen() + " - Pos: [" + i + "][" + j + "]");
                }
            }
        }
    }

    public Contenedor[][] getPatio() {
        return patio;
    }

    public void setPatio(Contenedor[][] patio) {
        this.patio = patio;
    }
}