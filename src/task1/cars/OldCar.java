package task1.cars;

public class OldCar extends BaseCar {

    int year;

    public OldCar(int countOfWheels, int maxSpeed, double engineVolume, int year) {
        super(countOfWheels, maxSpeed, engineVolume);
        this.year = year;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Year: " + year);
    }
}
