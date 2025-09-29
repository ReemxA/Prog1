public class CountFalseBooleans {

    /* Aufgabenstellung:
     * Implementieren Sie eine Methode namens countFalseBooleans (Sichtbarkeit public), 
     * die für ein als Parameter übergebenes Array 
     * die Anzahl an booleschen Werten mit dem Wert false zurückgibt.
     * 
     * Beispiel: Für ein Array { true, false, false, true, true } 
     * liefert countFalseBooleans den Wert 2 zurück. 
     */
    public static void main(String[] args) {
        // Main-Methode zum Testen ...
        // wird in der Bewertung nicht beachtet, es sei denn Programm kompiliert nicht 
        // oder ist nicht richtig ausführbar.
        // In der Klausur empfehlenswert leer stehen lassen.
        boolean[] test1 = {true, false, false, true, true};
        countFalseBooleans(test1);
    }

    // Ihre Methode hier ...

    public static int countFalseBooleans(boolean[] booleans) {
        int erg = 0;
        
        for(int i = 0; i < booleans.length; i++) {
            boolean index = booleans[i];
            if (index == false) {
                erg++;
            }
        }
        System.out.println(erg);
        return erg;
    }
}