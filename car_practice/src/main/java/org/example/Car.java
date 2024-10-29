package car_practice.src.main.java.org.example;

public class Car extends MotorisedVehicle{

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
}
