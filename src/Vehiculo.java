import interfaces.*;

public class Vehiculo implements Acelerar, Frenar, IniciarMarcha {
    protected final String marca;
    protected final String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void accionar() {
        System.out.println("El vehiculo se ha accionado");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
