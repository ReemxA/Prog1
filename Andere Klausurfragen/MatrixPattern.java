public class MatrixPattern {
    /**Implementieren Sie eine Methode namens matrixPattern (Sichtbarkeit public), 
     * die eine Ganzzahl als Parameter entgegennimmt, welche das Maß einer n x n Matrix angibt. 
     * Die Methode gibt eine Matrix (dargestellt als String) zurück, 
     * durch die eine Diagonale von oben links nach unten rechts verläuft. 
     * Die Punkte auf der Diagonale werden durch den Wert 1 dargestellt, 
     * alle anderen Punkte mit 0. Bitte achten Sie darauf, 
     * dass es keine Leerzeichen zwischen den Zeichen gibt.
     * 
     * Hinweis: Zeilenumbrüche innerhalb eines Strings sind in Java mit \n möglich.
     * 
     * Beispiel: Für den Eingabewert 4 wird folgendes Muster zurückgegeben:
     * 1000
     * 0100
     * 0010
     * 0001  
     */
    public static void main(String[] args) {
        // Main-Methode zum Testen ...
        System.out.print(matrixPattern(4));
    }

    // Ihre Methode hier ...
    
    public static String matrixPattern(int n) {
        String result = "";
        
        for (int i = 0; i < n; i++) { //Zeilen
            String row = "";
            for (int j = 0; j < n; j++) { //Spalten
                if (i == j) {
                    row += "1";
                } else {
                    row += "0";
                }
            }
            result += row;
            if (i < n - 1) {
                result += "\n"; // Kein Zeilenumbruch nach der letzten Zeile
            }
        }
        return result;
    }
}
