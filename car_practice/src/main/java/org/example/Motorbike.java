package car_practice.src.main.java.org.example;

public class Motorbike extends MotorisedVehicle {
    public Motorbike(int numWheels){
        super(numWheels);
    }

    public Boolean getHasSideCar() {
        return hasSideCar;
    }

    private Boolean hasSideCar;


    public void setHasSideCar(Boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }
}
