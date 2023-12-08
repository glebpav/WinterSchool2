package task1.cars;

public class PremiumCar extends BaseCar {

    int price;

    public PremiumCar(int countOfWheels, int maxSpeed, double engineVolume, int price) {
        super(countOfWheels, maxSpeed, engineVolume);
        this.price = price;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Prise: " + price);
    }
}
