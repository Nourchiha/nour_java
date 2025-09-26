public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("F", "Lion", 8, true);

        Zoo myZoo = new Zoo("Park", "Tunis", 29);

        myZoo.displayZoo();
        lion.displayAnimal();

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(lion.toString());
    }
}
