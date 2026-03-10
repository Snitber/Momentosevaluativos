public class ZonaAlmacenamiento {
    private Contenedor[][] matriz = new Contenedor[10][10];

    public void dibujarPatio() {
        System.out.println("\n--- MAPA DE PUESTOS ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("F" + i + " | ");
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] == null ? "[ ] " : "[X] ");
            }
            System.out.println();
        }
    }

    public boolean registrarEnColumna(int col, Contenedor c) {
        for (int f = 9; f >= 0; f--) {
            if (matriz[f][col] == null) {
                matriz[f][col] = c;
                return true;
            }
        }
        return false;
    }

    public double calcularPesoTotal() {
        double total = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] != null) total += matriz[i][j].getPeso();
            }
        }
        return total;
    }

    public void reportePorPais() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] != null) {
                    System.out.println("ID: " + matriz[i][j].getId() + " - Pais: " + matriz[i][j].getPais());
                }
            }
        }
    }

    public void setMatriz(Contenedor[][] matriz) {
        this.matriz = matriz;
    }
}