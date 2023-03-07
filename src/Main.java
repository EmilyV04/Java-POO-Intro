import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto("Suzuki", "XYZ", 150, Boolean.TRUE);
        Auto auto = new Auto("Toyota", "Hilux", "ABC12", 4);
        Bicicleta bicicleta = new Bicicleta("GX", "GHJ", "Delgada", "Grande", 5);

        Scanner sc = new Scanner(System.in);
        Integer opc = 0;

        while(opc != 4){
            System.out.println("\nSeleccione una opción para ver la información del vehiculo " +
                    "\n1. Moto" +
                    "\n2. Auto" +
                    "\n3. Bicicleta" +
                    "\n4. Salir");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Moto marca "+moto.getMarca()+", modelo "+moto.modelo+
                            ", cilindraje "+moto.getCilindraje()+" y"+moto.esElectrica());
                    moto.acelerar();
                    moto.frenar();
                    moto.iniciarMarcha();
                    moto.accionar();
                    break;
                case 2:
                    System.out.println("Auto marca "+auto.getMarca()+", modelo "+auto.getModelo()+
                            ", motor "+auto.getMotor()+" y con "+auto.getNumeroPuertas()+" puertas.");
                    auto.acelerar();
                    auto.frenar();
                    auto.iniciarMarcha();
                    auto.accionar();
                    break;
                case 3:
                    System.out.println("Bicicleta marca "+bicicleta.getMarca()+", modelo "+bicicleta.getModelo()+
                            ", tamaño "+bicicleta.getTamano()+", con tipo de llanta "+bicicleta.getTipoLlanta()+
                            "y "+bicicleta.getCambios()+" cambios.");
                    bicicleta.acelerar();
                    bicicleta.frenar();
                    bicicleta.iniciarMarcha();
                    bicicleta.accionar();
                    break;
                default:
                    System.out.println("------ SALIR ------");
                    break;
            }
        }

    }
}