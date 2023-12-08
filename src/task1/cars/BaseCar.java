package task1.cars;

public class BaseCar {

    int countOfWheels;
    int maxSpeed;
    double engineVolume;

    public BaseCar(int countOfWheels, int maxSpeed, double engineVolume) {
        this.countOfWheels = countOfWheels;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
    }

    public void show() {
        System.out.println("Count of wheels: " + countOfWheels);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Engine volume: " + engineVolume);
    }

}
