package transport_calculator;

class Controller {

    double calculateCost(Vehicle vehicle, int passengers, int distance){
        double fuelCost = vehicle.getFuelCost();
        double fuelConsumption = vehicle.getFuelConsumption();
        return (fuelConsumption/100)*distance*fuelCost*numberOfTrips(vehicle, passengers);
    }
    double calculateCost(Vehicle vehicle, double load, int distance){
        double fuelCost = vehicle.getFuelCost();
        double fuelConsumption = vehicle.getFuelConsumption();
        return (fuelConsumption/100)*distance*fuelCost*numberOfTrips(vehicle, load);
    }
    double calculateTime(Vehicle vehicle, int passengers, int distance){
        int speed = vehicle.getSpeed();
        return distance/speed*numberOfTrips(vehicle,passengers);
    }

    double calculateTime(Vehicle vehicle, double load, int distance){
        int speed = vehicle.getSpeed();
        return distance/speed*numberOfTrips(vehicle,load);
    }

    private double numberOfTrips(Vehicle vehicle, int passengers){
        return (Math.ceil(passengers/vehicle.getPlaces()));
    }

     private double numberOfTrips(Vehicle vehicle, double load){
        return (Math.ceil(load/vehicle.getCapacity()));
    }








}
