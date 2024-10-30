package car_practice.src.main.java.org.example;

public class Car extends MotorisedVehicle implements Functionality{

    private int numOfDoors;

    //constructor
    public Car(int numWheels, int numOfDoors) {
        super(numWheels);
        this.setNumOfDoors(numOfDoors);
    }

    //getter
    public int getNumOfDoors() {
        return numOfDoors;
    }

    //setter
    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String service() {
        StringBuilder carService = new StringBuilder();
        carService.append("change oil ");
        return carService.toString();
    }

    @Override
    public String Sound() {
        StringBuilder carSound = new StringBuilder();
        carSound.append("honk honk");
        return carSound.toString();
    }
}
