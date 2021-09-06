public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
       super(width, length);
       this.height = height;

       if (height < 0) {
           setHeight(0);
       }

    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
