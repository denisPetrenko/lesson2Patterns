package transport_calculator;

//class Facade

public class Interface {

    private Controller controller;

    public Interface() {
        controller = new Controller();
    }

    public void getAllInfo(Vehicle vehicle, int distance, int passengers){
        double cost = controller.calculateCost(vehicle,passengers,distance);
        double time = controller.calculateTime(vehicle,passengers,distance);
        System.out.println("Info about your task");

        System.out.println("Distance:"+distance);
        System.out.println("Passengers:"+passengers);
        System.out.println("Time:"+time);
        System.out.println("Cost:"+time);
    }


    //other public methods

}
