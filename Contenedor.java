public class Contenedor {
    // Atributos privados (Encapsulamiento)
    private String id;
    private String pais;
    private double peso;

    // Constructor para inicializar el objeto
    public Contenedor(String id, String pais, double peso) {
        this.id = id;
        this.pais = pais;
        this.peso = peso;
    }

    // Métodos Getter (Para obtener los datos)
    public String getPais() { return pais; }
    public double getPeso() { return peso; }
    public String getId() { return id; }

    // Métodos Setter (Para modificar los datos)
    public void setId(String id) {
        this.id = id;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
} // <--- Esta es la llave que cierra la clase. NO pongas más después de esta.