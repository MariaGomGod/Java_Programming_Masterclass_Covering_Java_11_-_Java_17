package com.timbuchalka;

public class Ejemplito {

    public static void main(String[] args) {
        int numeritoInt = 6;
        Integer numeritoInteger = new Integer(5);

        int numerito1 = 0;
        int numerito2 = -0;
        System.out.println(Integer.valueOf(numerito1).compareTo(Integer.valueOf(numerito2)));
        System.out.println(numerito1 == numerito2);

        double numerito3 = 5.0;
        double numerito4 = 5.00;
        System.out.println(Double.valueOf(numerito3).compareTo(Double.valueOf(numerito4)));
        System.out.println(numerito3 == numerito4);
        System.out.println(Double.valueOf(numerito3).equals(Double.valueOf(numerito4)));
        System.out.println("EMPIEZA LA FIESTA");

        imprimeInt(numeritoInt);
        imprimeInt(numeritoInteger.intValue()); // Java < 5
        imprimeInt(numeritoInteger);            // Java >= 5

        imprimeInteger(numeritoInteger);
        imprimeInteger(Integer.valueOf(numeritoInt)); // Java < 5
        imprimeInteger(numeritoInt);                  // Java >= 5

        boolean booleanPrimitivo = true;
        Boolean booleanEnvoltorio = new Boolean(true);

        imprimeBooleanPrimitivo(booleanPrimitivo);
        imprimeBooleanPrimitivo(booleanEnvoltorio.booleanValue()); // Java < 5
        imprimeBooleanPrimitivo(booleanEnvoltorio);                // Java >= 5

        imprimeBooleanEnvoltorio(booleanEnvoltorio);
        imprimeBooleanEnvoltorio(Boolean.valueOf(booleanPrimitivo)); // Java < 5
        imprimeBooleanEnvoltorio(booleanPrimitivo);                  // Java >= 5
    }

    private static void imprimeInt(int numerito) {
        System.out.println(numerito);
    }

    private static void imprimeInteger(Integer numerito) {
        System.out.println(numerito);
    }

    private static void imprimeBooleanPrimitivo(boolean bool) {
        System.out.println(bool);
    }

    private static void imprimeBooleanEnvoltorio(Boolean bool) {
        System.out.println(bool);
    }
}
