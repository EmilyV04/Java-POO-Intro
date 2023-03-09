public final class Auto extends Vehiculo {
    private String motor;
    private Integer numeroPuertas;

    public Auto(String marca, String modelo, String placa, String motor, Integer numeroPuertas) {
        super(marca, modelo, placa);
        this.motor = motor;
        this.numeroPuertas = numeroPuertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}
