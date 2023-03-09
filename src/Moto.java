public final class Moto extends Vehiculo {
    private Integer cilindraje;
    private Boolean esElectrica;

    public Moto(String marca, String modelo, String placa, Integer cilindraje, Boolean esElectrica) {
        super(marca, modelo, placa);
        this.cilindraje = cilindraje;
        this.esElectrica = esElectrica;
    }

    public Integer getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(Integer cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Boolean getEsElectrica() {
        return esElectrica;
    }

    public void setEsElectrica(Boolean esElectrica) {
        this.esElectrica = esElectrica;
    }

    public String esElectrica(){
        if(this.getEsElectrica())
            return(" SI es eléctrica.");
        else
            return(" NO es eléctrica.");
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindraje=" + cilindraje +
                ", esElectrica=" + esElectrica +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }
}
