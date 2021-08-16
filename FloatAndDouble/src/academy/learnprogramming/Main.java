package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("double maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value = " + myMinDoubleValue);
        System.out.println("double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; // No es muy recomendable utilizarlo. Se utiliza double.
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " +  myDoubleValue);



    }
}
