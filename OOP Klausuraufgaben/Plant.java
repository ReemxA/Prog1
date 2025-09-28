public class Plant {

    /*
     * Aufgabenstellung:
     * 
     * Im Folgenden wird ein Gartenmanagement-System implementiert. 
     * Erstellen Sie hierfür zunächst eine Klasse Plant.
     * Eine Pflanze (Plant) soll folgende Eigenschaften (Objektvariablen) besitzen:
     * 
     * einen Namen (name)
     * eine Pflanzenart (type, z. B. "Gemüse", "Blume", "Baum")
     * die Anzahl der Tage, die sie gewachsen ist (daysGrown), initialisiert mit 0
     * eine Wasserstandsanzeige (waterLevel), die mit 5 initialisiert wird
     * 
     * 1. Erstellen Sie für die Klasse Plant einen Konstruktor, 
     * der allen Objektvariablen beim Erstellen eines neuen Objekts Werte zuweist.
     * 
     * 2. Erstellen Sie in der Klasse Plant folgende Methoden mit der Sichtbarkeit public:
     * 
     * grow(int days): Erhöht die Anzahl der gewachsenen Tage um die übergebene Anzahl days 
     * und reduziert den Wasserstand um days. 
     * Gibt die Nachricht "<Name> ist um <days> Tage gewachsen" aus.
     * 
     * water(int amount): Erhöht den Wasserstand um amount. 
     * Gibt die Nachricht "<Name> wurde um <amount> Einheiten gegossen" aus.
     * 
     * isHealthy(): Gibt true zurück, wenn der Wasserstand zwischen 3 und 10 liegt, 
     * und false, wenn nicht.
     * 
     * printPlant(): Gibt den Namen, die Art, 
     * die gewachsenen Tage und den aktuellen Wasserstand aus.
     */

    // Attribute bzw. Objektvariablen:
    private String name;
    private String type;
    private int daysGrown;
    private int waterLevel;
    
    // Konstruktor:
    public Plant(String name, String type) {
        // Konstruktor mit nur Parametern name und type, 
        // da daysGrown und waterLevel laut Aufgabe feste Startwerte haben (0 und 5)
        // und vermieden werden soll, dass diese Initialwerte überschrieben werden.
        this.name = name;
        this.type = type;
        this.daysGrown = 0;
        this.waterLevel = 5;
    }
    
    // Methoden:

    // nicht statisch, da alle Methoden auf Objektvariablen zugreifen.
    //
    // static Methoden gehören zur Klasse, nicht zum Objekt
    // und dürfen nicht auf this oder Instanzvariablen zugreifen.

    public void grow(int days) {
        this.daysGrown += days; // += nicht =+ 
        this.waterLevel -= days;
        System.out.println(name + " ist um " + days + " Tage gewachsen ");
    }
    
    public void water(int amount) {
        this.waterLevel += amount;
        System.out.println(name + " wurde um " + amount + " Einheiten gegossen ");
    }
    
    public boolean isHealthy() {
        if(waterLevel <= 10 && waterLevel >= 3) {
            return true;
        } else {
            return false;
        }
    }
    
    public void printPlant() {
        System.out.println("Name: " + name);
        System.out.println("Art: " + type);
        System.out.println("gewachsene Tage: " + daysGrown);
        System.out.println("Aktueller Wasserstand: " + waterLevel);
    }
}