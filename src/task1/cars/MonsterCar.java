package task1.cars;

public class MonsterCar extends BaseCar {

    double sizeOfWheels;

    @Override
    public void show() {
        super.show();
        System.out.println("size of wheels: " + sizeOfWheels);

    }

    public MonsterCar(int countOfWheels, int maxSpeed, double engineVolume, double sizeOfWheels) {
        super(countOfWheels, maxSpeed, engineVolume);
        this.sizeOfWheels = sizeOfWheels;

    }
}


