public class CountZeroes {
    
    /* Aufgabenstellung:
     * Implementieren Sie eine Methodenamens countZeros (Sichtbarkeit public),
     * die für ein als Parameter übergebenes Array von Ganzzahlen (int[]) 
     * die Anzahl der Elemente mit dem Wert 0 zurückgibt.
     * 
     * Beispiel: Für das Array { 3, 0, 4, 0, 0, 7 } liefert countZeros den Rückgabewert 3.
     */

    public static void main(String[] args) {
        // Main-Methode zum Testen ...
        // Wird in der Bewertung nicht beachtet, es sei denn Programm kompiliert nicht 
        // oder ist nicht richtig ausführbar.
        // In der Klausur empfehlenswert leer stehen lassen.
        int[] test1 = {1, 0, 0, 0, 1};
        countZeroes(test1);
    }

    // Ihre Methode hier ...
    
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