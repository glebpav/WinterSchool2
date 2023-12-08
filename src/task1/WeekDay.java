package task1;

public enum WeekDay {

    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday");

    public String title;

    WeekDay(String title) {
        this.title = title;
    }
}
