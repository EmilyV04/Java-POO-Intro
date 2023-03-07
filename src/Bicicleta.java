public final class Bicicleta extends Vehiculo {
    private String tipoLlanta;
    private String tamano;
    private Integer cambios;

    public Bicicleta(String marca, String modelo, String tipoLlanta, String tamano, Integer cambios) {
        super(marca, modelo);
        this.tipoLlanta = tipoLlanta;
        this.tamano = tamano;
        this.cambios = cambios;
    }

    public String getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(String tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Integer getCambios() {
        return cambios;
    }

    public void setCambios(Integer cambios) {
        this.cambios = cambios;
    }
}
