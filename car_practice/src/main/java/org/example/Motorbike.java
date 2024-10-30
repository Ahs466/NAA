package car_practice.src.main.java.org.example;

public class Motorbike extends MotorisedVehicle {


    @Override
    public String service() {
        StringBuilder motorbikeService = new StringBuilder();
        motorbikeService.append("fix gears ");
        return motorbikeService.toString();
    }

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
