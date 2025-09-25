public class CountZeroes {
    
    public static void main(String[] args) {
        // Main-Methode zum Testen ...
        //wird in der Bewertung nicht beachtet, es sei denn Programm kompiliert nicht oder ist nicht richtig ausführbar.
        //in der Klausur empfehlenswert leer stehen lassen.
        int[] test1 = {1, 0, 0, 0, 1};
        countZeroes(test1);
    }

    // Ihre Methode hier ...
    /*
     * Methode, die für ein als Parameter übergebenes Array von Ganzzahlen (int[]) 
     * die Anzahl der Elemente mit dem Wert 0 zurückgibt.
     * 
     * Sichtbarkeit public (in der Aufgabenstellung gegeben)
     * Static (aus der Aufgabenstellung heraus selbst ermittelt)
     * Rückgabetyp int (aus der Aufgabenstellung heraus selbst ermittelt)
     * Parameter int[] (in der Aufgabenstellung gegeben)
     */
    public static int countZeroes(int[] n) {
        int erg = 0;
        for(int i = 0; i < n.length; i++) {
            int count = n[i];
            if(count == 0) {
                erg++;
            }
        }
        System.out.println(erg); //keine nötige Zeile
        return erg;
    }
}