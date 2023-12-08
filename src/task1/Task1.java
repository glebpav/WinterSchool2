package task1;

import task1.cars.DriftCar;
import task1.cars.MonsterCar;
import task1.cars.OldCar;
import task1.cars.PremiumCar;

public class Task1 {

    public static void main(String[] args) {

        Exhibition exhibition = new Exhibition();
        exhibition.weekDay = WeekDay.MONDAY;
        exhibition.setTime("19:00");
        exhibition.setDate("10.12.2023");

        exhibition.carArray.add(new OldCar(3, 100, 4.5, 1960));
        exhibition.carArray.add(new OldCar(3, 100, 4.5, 1960));
        exhibition.carArray.add(new PremiumCar(4, 289, 2.1, 3000000));
        exhibition.carArray.add(new OldCar(3, 432, 4.5, 1960));
        exhibition.carArray.add(new MonsterCar(3, 432, 4.5, 27));
        exhibition.carArray.add(new DriftCar(4, 432, 4.5, 1));


        exhibition.showAllCars();
    }

}
