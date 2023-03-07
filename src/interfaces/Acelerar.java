package interfaces;

public interface Acelerar {
    default public void acelerar() {
        System.out.println("El vehiculo está acelerando");
    }
    default public void accionar() {
        System.out.println("Accionar aceleración");
    }
}
