public class GardenApp {
    /*
     * Erstellen Sie eine Klasse GardenApp.
     * Legen Sie in der Klasse eine main-Methode an.
     * 
     * Implementieren Sie folgenden Ablauf:
     * 
     * 1. Erstellen Sie einen Garten mit dem Namen "Mein Garten" und einer Kapazität von 5.
     * 2. Fügen Sie drei Pflanzen hinzu (die Werte für ihre Eigenschaften können Sie sich ausdenken).
     * 3. Lassen Sie alle Pflanzen für 3 Tage wachsen.
     * 4. Gießen Sie alle Pflanzen mit 4 Einheiten Wasser.
     * 5. Listen Sie alle gesunden Pflanzen auf.
     * 6. Suchen Sie eine Pflanze nach ihrem Namen (z. B. "Rose") 
     *    und geben Sie ihre Details aus, falls sie gefunden wurde
     */
    public static void main(String[] args) {
        // 1.
        Garden jannah = new Garden("Mein Garten",5);

        // 2.
        Plant plant1 = new Plant("Moni", "Monstera");
        Plant plant2 = new Plant("Mona", "Monstera");
        Plant plant3 = new Plant("Lulu", "Cica");

        jannah.addPlant(plant1);
        jannah.addPlant(plant2);
        jannah.addPlant(plant3);

        // 3.
            plant1.grow(3);
            plant2.grow(3);
            plant3.grow(3);

        // 4.
        jannah.waterAllPlants(4);

        // 5.
        jannah.listHealthyPlants();

        // 6.
        Plant found = jannah.findPlantByName("Moni");
        if (found != null) {
            System.out.println("Gefundene Pflanze");
            found.printPlant();
        } else {
            System.out.println("Pflanze nicht gefunden.");
        }
    }
}
