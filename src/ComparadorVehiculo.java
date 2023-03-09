import java.util.Comparator;

public class ComparadorVehiculo implements Comparator<Vehiculo> {
    @Override
    public int compare(Vehiculo v1, Vehiculo v2) {
        return v2.getPlaca().compareTo(v1.getPlaca());
    }
}
