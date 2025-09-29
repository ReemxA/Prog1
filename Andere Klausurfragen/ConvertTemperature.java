import java.util.Arrays;

public class ConvertTemperature {

   /* Aufgabenstellung:
    * Implementieren Sie eine Methode namens convertTemperature (Sichtbarkeit public), die folgende Parameter entgegennimmt: 
    * --> einen Temperatur (Datentyp double)
    * --> eine Einheit für die Temperatur (Datentyp String)
    * ... und ein double-Array zurückgibt (double[])
    *
    * Die Methode soll sich wie folgt verhalten 
    * (beachten Sie auch die Reihenfolge der Zahlen im Array):
    * --> Ist die Einheit "Celsius": gebe Array mit Umrechnung in Kelvin an Index 0 und Umrechnung in Fahrenheit an Index 1 zurück
    * --> Ist die Einheit "Kelvin": gebe Array mit Umrechnung in Celsius an Index 0 und Umrechnung in Fahrenheit an Index 1 zurück
    * --> Ist die Einheit "Fahrenheit": gebe Array mit Umrechnung in Celsius an Index 0 und Umrechnung in Kelvin an Index 1 zurück
    * --> Entspricht der String mit der Einheit keiner der drei angegebenen Temperatureinheiten: gebe null zurück
    *
    * Die Temperaturen werden wie folgt umgerechnet:
    *
    * Celsius => Kelvin: temperature + 273.15
    * Celsius => Fahrenheit: temperature * 1.8 + 32
    * Kelvin => Celsius: temperature - 273.15
    * Kelvin => Fahrenheit: temperature * 1.8 - 459.67
    * Fahrenheit => Celsius: (temperature - 32) / 1.8
    * Fahrenheit => Kelvin: (temperature + 459.67) / 1.8 
    */
    public static void main(String[] args) {
        // Main-Methode zum Testen ...
        // wird in der Bewertung nicht beachtet, es sei denn Programm kompiliert nicht 
        // oder ist nicht richtig ausführbar.
        // In der Klausur empfehlenswert leer stehen lassen.
        convertTemperature(25.0, "Celsius");
        convertTemperature(77.0, "Fahrenheit");
        convertTemperature(42.0, "blabla");
    }

    // Ihre Methode hier ...
    
    public static double[] convertTemperature(double temperature, String unit) {
        switch(unit) {
            case "Celsius":
                double tempCK = temperature + 273.15;
                double tempCF =  temperature * 1.8 + 32;
                double[] erg1 = new double[2];
                erg1[0] = tempCK;
                erg1[1] = tempCF;
                System.out.println(Arrays.toString(erg1));
                    // In der Klausur ist Array.toString() nicht erlaubt!!
                    // einfach nach dem Testen wieder rauslöschen oder auskommentieren, sonst 0 Punkte.
                return erg1;
            case "Kelvin":
                double tempKC = temperature - 273.15;
                double tempKF = temperature * 1.8 - 459.67;
                double[] erg2 = new double[2];
                erg2[0] = tempKC;
                erg2[1] = tempKF;
                System.out.println(Arrays.toString(erg2));
                    // In der Klausur ist Array.toString() nicht erlaubt!!
                    // einfach nach dem Testen wieder rauslöschen oder auskommentieren, sonst 0 Punkte.
                return erg2;
            case "Fahrenheit":
                double tempFC = (temperature - 32) / 1.8;
                double tempFK = (temperature + 459.67) / 1.8;
                double[] erg3 = new double[2];
                erg3[0] = tempFC;
                erg3[1] = tempFK;
                System.out.println(Arrays.toString(erg3));
                    // In der Klausur ist Array.toString() nicht erlaubt!!
                    // einfach nach dem Testen wieder rauslöschen oder auskommentieren, sonst 0 Punkte.
                return erg3;
            default:
                return null;
        }
    }
}