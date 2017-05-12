import transport_calculator.Interface;
import transport_calculator.VehicleFactory;

public class Main {

    public static void main(String[] args) {
        Interface face = new Interface();
        face.getAllInfo(VehicleFactory.getCar(),145,20);
    }
}
