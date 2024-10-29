package car_practice.src.main.java.org.example;

public class MotorisedVehicle extends Vehicle {

    private int mileage;
    private String lastService;

    private String lastMOT;

    private int fuelCapacity;

    private FuelTypes fuel;

    public MotorisedVehicle(int numWheels) {
        super(numWheels);
    }
}