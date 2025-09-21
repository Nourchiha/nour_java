public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Méthode pour afficher les infos d’un animal
    public void displayAnimal() {
        System.out.println("Animal: " + name + " | Famille: " + family + " | Âge: " + age + " | Mammifère: " + isMammal);
    }

    // Redéfinition de toString()

    public String toString() {
        return "Animal{name='" + name + "', family='" + family + "', age=" + age + ", isMammal=" + isMammal + "}";
    }
}