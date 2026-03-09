public class Contenedor {
    private String id;
    private String paisOrigen;
    private double masa;

    public Contenedor(String id, String paisOrigen, double masa) {
        this.id = id;
        this.paisOrigen = paisOrigen;
        this.masa = masa;
    }

    public String getPaisOrigen() { return paisOrigen; }
    public double getMasa() { return masa; }
    
    @Override
    public String toString() {
        return "[ID:" + id + " | " + paisOrigen + "]";
    }
}