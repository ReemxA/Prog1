public class Garden {

    /*
     * Aufgabenstellung:
     * 
     * Erstellen Sie eine Klasse Garden.
     * Ein Garten (Garden) hat folgende Eigenschaften:
     * 
     * 1. einen Namen (name)
     * 2. ein Array für die Pflanzen im Garten (plants), 
     *    dessen maximale Größe beim Erstellen des Gartens festgelegt wird
     * 3. eine Variable currentSize, die die Anzahl der derzeit im Garten 
     *    befindlichen Pflanzen speichert und mit 0 initialisiert wird
     * 
     * Erstellen Sie einen Konstruktor, der den Namen des Gartens 
     * und die maximale Anzahl an Pflanzen im Array setzt.
     * 
     * Legen Sie in der Klasse Garden folgende Methoden an:
     * 
     * 1. addPlant(Plant plant): 
     * Fügt eine neue Pflanze zum Garten hinzu, wenn noch Platz ist. 
     * Falls das Array voll ist, gibt die Methode die Nachricht 
     * "Keine weiteren Pflanzen können hinzugefügt werden" aus.
     * 
     * 2. waterAllPlants(int amount): 
     * Gießt alle Pflanzen im Garten mit der angegebenen Wassermenge.
     * 
     * 3. listHealthyPlants(): 
     * Gibt alle Pflanzen aus, die gesund sind 
     * (verwenden Sie die Methode isHealthy() der Klasse Plant).
     * 
     * 4. findPlantByName(String name): 
     * Gibt die Pflanze mit dem angegebenen Namen zurück 
     * oder null, wenn keine solche Pflanze gefunden wurde.
     */

     // Attribute:
     private String name;
     private Plant[] plants;
     private int currentSize = 0;
     
     // Konstruktor
     public Garden(String name, int maxSize) {
        this.name = name;
        this.plants = new Plant[maxSize];
     }

     // Methoden:
     public void addPlant(Plant plant) {
        if (currentSize < plants.length) {
            plants[currentSize] = plant;
            currentSize++;
        } else {
            System.out.println("Keine weiteren Pflanzen können hinzugefügt werden");
        }
     }

     public void waterAllPlants(int amount) {
        for (int i = 0; i < currentSize; i++) {
            plants[i].water(amount);
        }
     }
     public void listHealthyPlants() {
                for (int i = 0; i < currentSize; i++) {
            if (plants[i].isHealthy()) {
                System.out.println("gesunde Pflanzen: ");
                plants[i].printPlant();
            }
        }
     }
     public Plant findPlantByName(String name) {
        for(int i = 0; i < currentSize; i++) {
            if (plants[i].getName().equals(name)) {
                return plants[i];
            }
        }
        return null;
     }
}