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
    private int daysGrown = 0;
    private int waterLevel = 5;
    
    // Konstruktor:
    public Plant(String name, String type, int daysGrown, int waterLevel) {
        this.name = name;
        this.type = type;
        this.daysGrown = daysGrown;
        this.waterLevel = waterLevel;
    }
    
    // Methoden:
    public static void grow(int days) {
        this.daysGrown =+ days;
        this.waterLevel =- days;
        System.out.println(name + " ist um " + days + " Tage gewachsen ");
    }
    
    public static void water(int amount) {
        this.waterLevel =+ amount;
        System.out.println(name + " wurde um " + amount + " Einheiten gegossen ");
    }
    
    public static boolean isHealthy() {
        if(waterLevel <= 10 && waterLevel >= 3) {
            return true
        } else {
            return false;
        }
    }
    
    public static void printPlant() {
        System.out.println("Name: " + name);
        System.out.println("Art: " + type);
        System.out.println("gewachsene Tage: " + daysGrown);
        System.out.println("Aktueller Wasserstand: " + waterLevel);
    }
}
