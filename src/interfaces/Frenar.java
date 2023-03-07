package interfaces;

public interface Frenar {
    default public void frenar() {
        System.out.println("El vehiculo está frenando");
    }
    default public void accionar() {
        System.out.println("Accionar frenado");
    }
}
