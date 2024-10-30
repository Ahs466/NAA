package car_practice.src.main.java.org.example;

public abstract class Vehicle{

    public abstract String service();

    public Vehicle(int numWheels){
        this.setNumWheels(numWheels);
    }

    public Vehicle(){

    }

    private int numWheels;
    private int numSeats;
    private int maxSpeed;

    //getters
    public int getNumWheels() {
        return numWheels;
    }
    public int getNumSeats() {
        return numSeats;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    //setters
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}