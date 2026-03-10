public class GestorPuerto {
    private String[] muellesBuques = new String[10];
    private int buquesAtendidos = 0;
    public ZonaAlmacenamiento patio = new ZonaAlmacenamiento();

    public void registrarEntradaBuque(String nombre) {
        if (buquesAtendidos < 10) {
            muellesBuques[buquesAtendidos++] = nombre;
            System.out.println("Buque '" + nombre + "' anclado con éxito.");
        } else {
            // Esta es la advertencia que pide el documento técnico
            System.out.println("ADVERTENCIA: No hay espacio en el array de buques.");
        }
    }

    public int getEspaciosLibresBuques() {
        return 10 - buquesAtendidos;
    }

    public String[] getMuellesBuques() {
        return muellesBuques;
    }

    public void setMuellesBuques(String[] muellesBuques) {
        this.muellesBuques = muellesBuques;
    }
}