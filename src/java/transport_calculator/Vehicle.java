package transport_calculator;

class Vehicle {

    private double fuelCost;
    private double fuelConsumption;
    private double capacity;
    private int places;
    private int speed;


    double getFuelCost() {
        return fuelCost;
    }

    void setFuelCost(double fuelCost) {
        this.fuelCost = fuelCost;
    }


    double getCapacity() {
        return capacity;
    }

    void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    int getPlaces() {
        return places;
    }

    void setPlaces(int places) {
        this.places = places;
    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    double getFuelConsumption() {
        return fuelConsumption;
    }

    void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
