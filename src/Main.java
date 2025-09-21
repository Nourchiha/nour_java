public class Main {
    public static void main(String[] args) {
        // Création d’un animal
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Création d’un zoo
        Zoo myZoo = new Zoo("Safari Park", "Tunis", 25);

        // Affichage via les méthodes
        myZoo.displayZoo();
        lion.displayAnimal();

        // Affichage direct via toString()
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(lion.toString());
    }
}
