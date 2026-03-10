public class GestorPuerto {
    private String[] listaBuques = new String[10];
    private int cantidad = 0;
    public ZonaAlmacenamiento zona = new ZonaAlmacenamiento();

    public void anclarBuque(String nombre) {
        if (cantidad < 10) {
            listaBuques[cantidad++] = nombre;
            System.out.println("Buque anclado.");
        } else {
            System.out.println("ADVERTENCIA: No hay muelles.");
        }
    }

    public void setListaBuques(String[] listaBuques) {
        this.listaBuques = listaBuques;
    }
}