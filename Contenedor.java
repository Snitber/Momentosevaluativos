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

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }
}