public class NrOfIdenticalPairs {
    public static void main(String[] args) {
        // Main-Methode zum Testen ...
        int[] test1 = { 1, 2, 3, 1, 1, 3 };
        nrOfIdenticalPairs(test1);
    }

    // Ihre Methode hier ...
    /*
     * Methode namens nrOfIdenticalPairs (Sichtbarkeit public), 
     * die für ein als Parameter übergebenes Array (int[]) 
     * die Anzahl an Paaren von identischen Zahlen zurückgibt. 
     * Hinweis: Stellen Sie dabei sicher, Paare nicht doppelt zu zählen.
     * 
     * Beispiel: 
     * Für ein Array { 1, 2, 3, 1, 1, 3 } liefert die Methode den Wert 4 zurück. 
     * Die Paare wären dabei:
     * Index 0 und Index 3 (Zahl: 1)
     * Index 0 und Index 4 (Zahl: 1)
     * Index 3 und Index 4 (Zahl: 1)
     * Index 2 und Index 5 (Zahl: 3)
     */
    public static int nrOfIdenticalPairs(int[] n) {
        int erg = 0;
        for(int i = 0; i < n.length; i++) {
            for(int j = i + 1; j < n.length; j++) {
              if (n[i] == n[j]) {
                  erg++;
              }  
            }
        }
        System.out.println(erg);
        return erg;
    }
}