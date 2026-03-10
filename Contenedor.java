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

    public void setId(String id) {
        this.id = id;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
                                                            }
}