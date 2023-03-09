import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Moto moto1 = new Moto("Suzuki", "XYZ", "YUI852", 150, Boolean.TRUE);
        Moto moto2 = new Moto("Honda", "ABC", "QWE798", 300, Boolean.FALSE);
        Moto moto3 = new Moto("Yamaha", "QWE", "GHJ456", 250, Boolean.FALSE);


        Auto auto1 = new Auto("Toyota", "Hilux", "YUI852", "ABC12", 4);
        Auto auto2 = new Auto("Mazda", "CX5", "YUI852", "ABC123", 2);
        Auto auto3 = new Auto("Chevrolet", "Hilux", "YUI886", "ABC12", 4);

        Bicicleta bicicleta = new Bicicleta("GX", "GHJ", "TYU694", "Delgada", "Grande", 5);

        System.out.println(auto1.equals(moto1));
        System.out.println(auto1.hashCode() == moto1.hashCode());

        //ArrayList para guardar motos
        ArrayList<Moto> motos = new ArrayList<>();
        motos.add(moto1);
        motos.add(moto2);
        motos.add(moto3);

        //HashMap para agregar autos
        HashMap<Integer,Auto> autos = new HashMap();
        autos.put(1, auto1);
        autos.put(2, auto2);
        autos.put(3, auto1);

        Scanner sc = new Scanner(System.in);
        Integer opc = 0;

        motos.sort(new ComparadorVehiculo());

        motos.forEach(System.out::println);

       /* while(opc != 4){
            System.out.println("\nSeleccione una opción para ver la información del vehiculo " +
                    "\n1. Moto" +
                    "\n2. Auto" +
                    "\n3. Bicicleta" +
                    "\n4. Salir");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    for (int i = 0; i < motos.size(); i++){
                        System.out.println("["+i+"] "+"Moto marca "+motos.get(i).getMarca()+", modelo "+motos.get(i).modelo+
                                ", cilindraje "+motos.get(i).getCilindraje()+" y"+motos.get(i).esElectrica());
                    }

                    motos.remove(1);
                    System.out.println("\nSe ha eliminado el elemento de la posición 1\n");

                    for (int i = 0; i < motos.size(); i++){
                        System.out.println("["+i+"] "+"Moto marca "+motos.get(i).getMarca()+", modelo "+motos.get(i).modelo+
                                ", cilindraje "+motos.get(i).getCilindraje()+" y"+motos.get(i).esElectrica());
                    }

                    moto1.acelerar();
                    moto1.frenar();
                    moto1.iniciarMarcha();
                    moto1.accionar();
                    break;
                case 2:
                    for(Integer key: autos.keySet()){
                        System.out.println("["+key+"] "+"Auto marca "+autos.get(key).getMarca()+", modelo "+autos.get(key).getModelo()+
                                ", motor "+autos.get(key).getMotor()+" y con "+autos.get(key).getNumeroPuertas()+" puertas.");
                    }

                    auto1.acelerar();
                    auto1.frenar();
                    auto1.iniciarMarcha();
                    auto1.accionar();
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
        }*/

    }
}