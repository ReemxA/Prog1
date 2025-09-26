import java.util.Scanner;
import java.util.InputMismatchException;

/* Aufgabenstellung:
 * Implementieren Sie ein Konsolenprogramm mit dem Namen CalculatorApp, 
 * das dem Benutzer ein einfaches Menü zur Auswahl bietet.
 * 
 * Das Programm soll eine Endlosschleife verwenden 
 * und bei jeder Iteration das folgende Menü anzeigen:
 * (1) Zwei Zahlen addieren
 * (2) Zwei Zahlen multiplizieren
 * (3) Programm beenden
 * 
 * Der Benutzer wählt eine Option durch Eingabe einer Zahl (1, 2 oder 3).
 * Das Programm soll auf die Eingabe wie folgt reagieren:
 * 
 * Bei Eingabe von "1" soll die Methode addNumbers(int a, int b) 
 * (zu implementieren) aufgerufen werden.
 * Vor dem Methodenaufruf sollen zwei int-Zahlen vom Benutzer eingelesen werden.
 * Die Methode berechnet die Summe der beiden Zahlen und gibt den Wert zurück.
 * Das Ergebnis wird auf der Konsole ausgegeben.
 * 
 * Bei Eingabe von "2" soll die Methode multiplyNumbers(int a, int b) aufgerufen werden.
 * Vor dem Methodenaufruf sollen zwei int-Zahlen vom Benutzer eingelesen werden.
 * Die Methode berechnet das Produkt der beiden Zahlen und gibt den Wert zurück.
 * Das Ergebnis wird auf der Konsole ausgegeben.
 * 
 * Bei Eingabe von "3" soll der Text "Programm wird beendet." ausgegeben werden.
 * 
 * Benutzen Sie den dargestellten Code als Anfangslösung.
 */

public class CalculatorApp {

    // Im Anfangscode kein globaler Klassenscanner vorhanden, 
    // sondern Scanner Objekt in der Methode readUserInput().
    // Attribut selbst ergänzt.
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            showMainMenu();
            String choice = readUserInput();
            handleUserInput(choice);
            System.out.println();
        }
    }

    // Bereits im Anfangscode vorgegeben
    private static void showMainMenu() {
        System.out.println("=== Menü ===");
        System.out.println("(1) Zwei Zahlen addieren");
        System.out.println("(2) Zwei Zahlen multiplizieren");
        System.out.println("(3) Programm beenden");
        System.out.print("Ihre Wahl: ");
    }

    // Bereits im Anfangscode vorgegeben
    private static String readUserInput() {
        return scanner.nextLine();
    }

    // Bereits im Anfangscode vorgegeben, aber nur mit case "3", ohne default.
    private static void handleUserInput(String input) {
        switch (input) {
            case "1":
                System.out.println("Bitte geben Sie Ihren ersten Summanden als Ganzzahl ein");
                int a = readInt(); // wenn keine readInt() Methode vorhanden, dann diese Zeile hiermit ersetzen:
                //int a = scanner.nextInt;
                System.out.println("Bitte geben Sie Ihren zweiten Summanden als Ganzzahl ein");
                int b = readInt(); // wenn keine readInt() Methode vorhanden, dann diese Zeile hiermit ersetzen:
                //int b = scanner.nextInt;
                addNumbers(a, b);
                break;
                
            case "2":
                System.out.println("Bitte geben Sie Ihren Multiplikator als Ganzzahl ein");
                int x = readInt(); // wenn keine readInt() Methode vorhanden, dann diese Zeile hiermit ersetzen:
                //int x = scanner.nextInt;
                System.out.println("Bitte geben Sie Ihren Multiplikanden als Ganzzahl ein");
                int y = readInt(); // wenn keine readInt() Methode vorhanden, dann diese Zeile hiermit ersetzen:
                //int y = scanner.nextInt;
                multiplyNumbers(x, y);
                break;
                
            case "3":
                System.out.println("Programm wird beendet.");
                System.exit(0);
            default:
                System.out.println("Ungültige Eingabe. Bitte wählen Sie 1, 2 oder 3.");
        }
    }
    
    // Optionale Methode zur Fehlerbehandlung bei falscher Eingabe der Ganzzahlen.
    // Nicht vorgegeben, nicht notwendig, da in der Aufgabenstellung keine Fehlerbehandlung gefordert wird.
    private static int readInt() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein: ");
            } finally {
                scanner.nextLine(); // Wichtig: Verbleibende Eingabe verwerfen
            }
        }
    }
    
    // Selbst implementierte Methode
    private static int addNumbers(int a, int b) {
        int c = a + b;
        System.out.println("Die Summe der beiden Zahlen lautet: " + c);
        return c;
    }
    
    // Selbst implementierte Methode
    private static int multiplyNumbers(int a, int b) {
        int c = a * b;
        System.out.println("Das Produkt der beiden Zahlen lautet: " + c);
        return c;
    }
}