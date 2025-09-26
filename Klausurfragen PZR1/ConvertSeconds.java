import java.util.Arrays;
public class ConvertSeconds {
    /* Aufgabenstellung: 
     * Implementieren Sie eine Methode namens convertSeconds (Sichtbarkeit public),
     * die einen Wert (Datentyp int) entgegennimmt, welcher Sekunden darstellt.
     * 
     * Die Methode soll ein int[]-Array zurückgeben, das die übergebene Zeit 
     * in folgende Bestandteile zerlegt (in dieser Reihenfolge):
     * 1. Stunden an Index 0 des Arrays
     * 2. Minuten an Index 1 des Arrays
     * 3. Sekunden an Index 2 des Arrays
     * 
     * Beispiel:
     * Für den Aufruf convertSeconds(3675) soll das zurückgegebene Array 
     * wie folgt aussehen: {1, 1, 15}
     * 
     * Hinweis: Verwenden Sie ganzzahlige Division (/) 
     * und den Modulo-Operator (%) zur Zerlegung der Zeit.
     */
    public static void main(String[] args) {
        // Main methode zum testen ...
        // wird in der Bewertung nicht beachtet, es sei denn Programm kompiliert nicht 
        // oder ist nicht richtig ausführbar.
        // In der Klausur empfehlenswert leer stehen lassen.
        convertSeconds(3675);
    }

    // Ihre Methode hier ...
    
    public static int[] convertSeconds(int n) {

        int[] time = new int[3];
        int min = n / 60 % 60; 
        int h = n / 60 / 60;
        int sec = n % 60; 

        time[0] = h;
        time[1] = min;
        time[2] = sec;
        
        System.out.println(Arrays.toString(time)); 
            // In der Klausur ist Array.toString() nicht erlaubt!!
            // einfach nach dem Testen wieder rauslöschen oder auskommentieren, sonst 0 Punkte.
        
        return time;
    }
}