public class ZonaAlmacenamiento {
    private Contenedor[][] matriz = new Contenedor[10][10];

    public void dibujarPatio() {
        System.out.println("\n--- MAPA DE CONTENEDORES (F9=Suelo) ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Fila " + i + " | ");
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] == null ? "[  ] " : "[XX] ");
            }
            System.out.println();
        }
        System.out.println("         0    1    2    3    4    5    6    7    8    9 (Cols)");
    }

    public boolean registrarEnColumna(int col, Contenedor c) {
        // Lógica: busca desde la fila 9 hacia arriba para no dejar vacíos abajo
        for (int f = 9; f >= 0; f--) {
            if (matriz[f][col] == null) {
                matriz[f][col] = c;
                return true;
            }
        }
        return false;
    }

    public double calcularPesoTotal() {
        double suma = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] != null) suma += matriz[i][j].getPeso();
            }
        }
        return suma;
    }

    public void reportePorPais() {
        System.out.println("\n--- INVENTARIO POR ORIGEN ---");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] != null) {
                    System.out.println("ID: " + matriz[i][j].getId() + " | País: " + matriz[i][j].getPais() + " | Ubicación: ["+i+"]["+j+"]");
                }
            }
        }
    }

    public Contenedor[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Contenedor[][] matriz) {
        this.matriz = matriz;
    }
}