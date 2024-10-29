package car_practice.src.main.java.org.example;

public class MotorisedVehicle extends Vehicle {

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    private int mileage;

    public String getLastService() {
        return lastService;
    }

    public void setLastService(String lastService) {
        this.lastService = lastService;
    }

    private String lastService;

    public String getLastMOT() {
        return lastMOT;
    }

    public void setLastMOT(String lastMOT) {
        this.lastMOT = lastMOT;
    }

    private String lastMOT;

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    private int fuelCapacity;

    public FuelTypes getFuel() {
        return fuel;
    }

    public void setFuel(FuelTypes fuel) {
        this.fuel = fuel;
    }

    private FuelTypes fuel;

    public MotorisedVehicle(int numWheels) {
        super(numWheels);
    }
}