public class ThreeConsecutiveOdds {
    /* Aufgabenstellung:
     * 
     * Implementieren Sie eine Methode namens threeConsecutiveOdds (Sichtbarkeit public) 
     * die ein Array von int-Werten entgegennimmt und true zurückgibt, 
     * sofern dieses drei direkt aufeinanderfolgende ungerade Zahlen beinhaltet. 
     * Andernfalls wird false zurückgegeben.
     * 
     * Versehen Sie die Methode anschließend mit aussagekräftigem Javadoc.
     * 
     * Beispiel: 
     * Für ein Array mit den Werten { 1, 2, 3, 5, 7, 8 } wird true zurückgegeben.
     */

     public static void main(String[] args) {
        // Main-Methode zum Testen ...
        int[] test = { 1, 2, 3, 5, 7, 8 };
        System.out.print(threeConsecutiveOdds(test));
    }

    // Ihre Methode hier ...
    /**
     * Prüft, ob ein Array von Ganzzahlen mindestens drei direkt aufeinanderfolgende
     * ungerade Zahlen enthält.
     *
     * @param n das zu überprüfende Array von int-Werten
     * @return true, wenn drei ungerade Zahlen direkt hintereinander vorkommen, sonst false
     *
     * Beispiel:
     * Für das Array {1, 2, 3, 5, 7, 8} wird true zurückgegeben,
     * da die Werte 3, 5 und 7 direkt aufeinander folgen und ungerade sind.
     */
    public static boolean threeConsecutiveOdds(int[] n) {
        for(int i = 0; i < n.length - 2; i++) {
            if(n[i] % 2 != 0 && n[i + 1] % 2 != 0 && n[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}