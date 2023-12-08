public class Stool {

    private int counter;
    private double height;
    private int countOfLegs;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getCountOfLegs() {
        counter++;
        return countOfLegs;
    }

    public void setCountOfLegs(int countOfLegs) {

        if (countOfLegs <= 0) {
            System.out.println("Error: count of legs must be positive");
            return;
        }

        this.countOfLegs = countOfLegs;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {

        if (color == Colors.RED) {
            System.out.println("Error: color can't be RED");
            return;
        }

        this.color = color;
    }

    private Colors color;

    Stool(double height, int countOfLegs, Colors color) {
        this.height = height;
        this.countOfLegs = countOfLegs;
        this.color = color;
    }

    Stool(double height) {
        this(height, 4, Colors.RED);
        System.out.println("Second constructor");
    }

    void paint(Colors newColor) {
        if (color == newColor) {
            System.out.println("Stool is already this color");
        } else {
            color = newColor;
        }
    }

    void paint() {
        paint(Colors.WHITE);
    }
}
