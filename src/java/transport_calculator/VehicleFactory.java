package transport_calculator;

public class VehicleFactory {

    public static Vehicle getCar(){
        Vehicle v = new Vehicle();
        v.setCapacity(500);
        v.setFuelCost(25.6);
        v.setPlaces(4);
        v.setSpeed(90);
        v.setFuelConsumption(10);
        return v;
    }

    public static Vehicle getBike(){
        Vehicle v = new Vehicle();
        v.setCapacity(25);
        v.setFuelCost(12.5);
        v.setPlaces(1);
        v.setSpeed(20);
        v.setFuelConsumption(2);
        return v;
    }
    public static Vehicle getWagon(){
        Vehicle v = new Vehicle();
        v.setCapacity(1000);
        v.setFuelCost(40);
        v.setPlaces(8);
        v.setSpeed(15);
        v.setFuelConsumption(2);
        return v;
    }

}
