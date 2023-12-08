package task1.cars;

public class DriftCar extends BaseCar{
    int frictionFactor;
    public DriftCar(int countOfWheels, int maxSpeed, double engineVolume, int frictionFactor) {
        super(countOfWheels, maxSpeed, engineVolume);

        this.frictionFactor = frictionFactor;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Friction factor: " + frictionFactor);
    }

}
