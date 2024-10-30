package car_practice.src.main.java.org.example;

public class Bicycle extends Vehicle implements Functionality{

    public Bicycle(){
        super(2);
    }

    public Bicycle(int numWheels){
        this.setNumWheels(numWheels);
    }

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    private int numGears;


    @Override
    public String service() {
        StringBuilder cycleService = new StringBuilder();
        cycleService.append("change wheels ");
        return cycleService.toString();
    }

    @Override
    public String Sound() {
        StringBuilder cycleSound = new StringBuilder();
        cycleSound.append("ding ding");
        return cycleSound.toString();
    }
}