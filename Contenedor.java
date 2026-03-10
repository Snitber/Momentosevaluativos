public class Contenedor {
    private String id;
    private String pais;
    private double peso;

    public Contenedor(String id, String pais, double peso) {
        this.id = id;
        this.pais = pais;
        this.peso = peso;
    }

    public String getPais() { return pais; }
    public double getPeso() { return peso; }
    public String getId() { return id; }
}