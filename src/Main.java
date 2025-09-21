public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        Zoo myZoo = new Zoo("Safari Park", "Tunis", 25);

        myZoo.displayZoo();
        lion.displayAnimal();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(lion.toString());
    }
}
