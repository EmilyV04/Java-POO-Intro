package interfaces;

public interface IniciarMarcha {
    default public void iniciarMarcha() {
        System.out.println("El vehiculo se ha puesto en marcha");
    }
    default public void accionar() {
        System.out.println("Accionar puesta en marcha");
    }
}
