public class Circle {
    private double radious;
    public int count;//count for calculate no of objects

    public Circle() {
        super();
        this.radious=0.0;
        count++;
    }

    public Circle(double radious) {
        this();
        this.radious = radious;
    }

    public double getRadious() {

        return this.radious;
    }

    public static int getCount() {
        return count;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }
}
