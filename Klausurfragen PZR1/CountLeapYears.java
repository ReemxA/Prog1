public class CountLeapYears {
    
    /* Aufgabenstellung:
     * Implementieren Sie eine Methode namens countLeapYears (Sichtbarkeit public),
     * die folgende Parameter entgegennimmt: 
     * --> eine Startzahl from (Datentyp int)
     * --> eine Endzahl to (Datentyp int)
     * 
     * Die Methode  gibt ein int zurück, der angibt, 
     * wie viele Schaltjahre im Bereich von from bis to (einschließlich) liegen.
     * 
     * Ein Jahr gilt als Schaltjahr, wenn eine der folgenden Bedingungen erfüllt ist:
     * Das Jahr ist durch 4 teilbar, aber nicht durch 100
     * Oder: Das Jahr ist durch 400 teilbar
     * 
     * Beispiel:
     * Für den Aufruf countLeapYears(1999, 2004) soll die Methode den Wert 2 zurückgeben,
     * da die Jahre 2000 und 2004 Schaltjahre sind.
     */
    public static void main(String[] args) {
        // Main-Methode zum Testen ...
        // wird in der Bewertung nicht beachtet, es sei denn Programm kompiliert nicht 
        // oder ist nicht richtig ausführbar.
        // In der Klausur empfehlenswert leer stehen lassen.
        countLeapYears(1999, 2004);
    }

    // Ihre Methode hier ...

    public static int countLeapYears(int from, int to) {
        int erg = 0;
        for (int i = from; i <= to; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                erg++;
            }
        }
        System.out.println(erg);
        return erg;
    }
}