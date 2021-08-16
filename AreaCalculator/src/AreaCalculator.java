public class AreaCalculator {

    private static final double PI = Math.PI;

    public static void main(String[] args) {

        double resultCircleArea = area(-1.0);
        System.out.println("Circle area = " + resultCircleArea);

        double resultRectangleArea = area(5.0,4.0);
        System.out.println("Rectangle area = " + resultRectangleArea);

    }

    public static double area(double radius) {

        if (radius < 0) {
            System.out.println("Invalid value");
            return -1.0;
        }

        double circleArea = radius * radius * PI;
        return circleArea;
    }

    public static double area(double x, double y) {

        if ((x < 0 || y < 0) || (x < 0 && y < 0)) {
            System.out.println("Invalid value");
            return -1.0;
        }

        double rectangleArea = x * y;
        return rectangleArea;
    }
}
