public class GestorPuerto {
    private String[] listaBuques = new String[10];
    private int cantidadActual = 0;
    public ZonaAlmacenamiento zona = new ZonaAlmacenamiento();

    public void anclarBuque(String nombre) {
        if (cantidadActual < 10) {
            listaBuques[cantidadActual] = nombre;
            cantidadActual++;
            System.out.println("¡Buque '" + nombre + "' registrado en el muelle!");
        } else {
            System.out.println("ADVERTENCIA: No hay muelles disponibles (Máximo 10).");
        }
    }

    public int disponibles() {
        return 10 - cantidadActual;
    }
}