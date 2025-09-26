public class Main {
    public static void main(String[] args) {
        // Création d'animaux
        Animal lion = new Animal("Félin", "Lion", 8, true);
        Animal perroquet = new Animal("Oiseau", "Perroquet", 2, false);

        // Création d'un zoo
        Zoo myZoo = new Zoo("Park", "Tunis", 1);

        // Affichage du zoo
        myZoo.displayZoo();

        // Affichage d’un animal
        lion.displayAnimal();

        // Test toString()
        System.out.println(myZoo);
        System.out.println(lion);

        System.out.println("Ajout Lion : " + myZoo.addAnimal(lion));
        System.out.println("Ajout Perroquet : " + myZoo.addAnimal(perroquet));
        // Affichage des animaux ajoutés
        System.out.println("\n=== Animaux dans le zoo ===");
        for (int i = 0; i < myZoo.nbrAnimals; i++) {
            System.out.println(myZoo.animals[i]);
        }
    }
}
