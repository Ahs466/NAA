package car_practice.src.main.java.org.example;

public class Experimentation {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        Bicycle b2 = new Bicycle(3);
        Car c1 = new Car(4,4);
        Car c2 = new Car(4,2);
        Motorbike mb1 = new Motorbike(2);


        Vehicle[] vehiclesList = {b1,c2,mb1};
        for(Vehicle vehicleObject: vehiclesList){
            System.out.println(vehicleObject.service());
        }

        Functionality[] listOfSounds = {b1, b2, c1, mb1};

        for (Functionality soundObject: listOfSounds){
            System.out.println("The type of sound: " + soundObject.Sound());
        }
    }
}