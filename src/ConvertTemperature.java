import java.util.Arrays;

public class ConvertTemperature {
    public static void main(String[] args) {
        // Main-Methode zum Testen ...
        convertTemperature(25.0, "Celsius");
        convertTemperature(77.0, "Fahrenheit");
        convertTemperature(42.0, "blabla");
    }

    public static double[] convertTemperature(double temperature, String unit) {
        switch(unit) {
            case "Celsius":
                double tempCK = temperature + 273.15;
                double tempCF =  temperature * 1.8 + 32;
                double[] erg1 = new double[2];
                erg1[0] = tempCK;
                erg1[1] = tempCF;
                System.out.println(Arrays.toString(erg1));
                return erg1;
            case "Kelvin":
                double tempKC = temperature - 273.15;
                double tempKF = temperature * 1.8 - 459.67;
                double[] erg2 = new double[2];
                erg2[0] = tempKC;
                erg2[1] = tempKF;
                System.out.println(Arrays.toString(erg2));
                return erg2;
            case "Fahrenheit":
                double tempFC = (temperature - 32) / 1.8;
                double tempFK = (temperature + 459.67) / 1.8;
                double[] erg3 = new double[2];
                erg3[0] = tempFC;
                erg3[1] = tempFK;
                System.out.println(Arrays.toString(erg3));
                return erg3;
            default:
                return null;
        }
    }
}