package task1;

import task1.cars.BaseCar;

import java.util.ArrayList;

public class Exhibition {

    ArrayList<BaseCar> carArray; // null

    Exhibition() {
        carArray = new ArrayList<>();
    }

    private String date;
    WeekDay weekDay;
    private String time;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if (date.startsWith("-")) {
            System.out.println("Error: date can't be negative");
            return;
        }
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        if (time.startsWith("-")) {
            System.out.println("Error: date can't be negative");
            return;
        }
        this.time = time;
    }

    public void showAllCars() {
        for (BaseCar car : carArray) {
            System.out.println("Number of car: " + (carArray.indexOf(car) + 1));
            car.show();
        }
    }


}
