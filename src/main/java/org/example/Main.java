class Person {
    // Instansvariabler (tilhører hvert objekt)
    String name;
    int age;

    // Statisk variabel (tilhører klassen, delt af alle objekter)
    static String species = "Homo Sapiens";

    // Instansmetode (tilgås af et objekt)
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Species: " + species);
    }

    // Statisk metode (tilgås uden at oprette et objekt)
    static void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

public class Main {
    public static void main(String[] args) {
        // Tilgå statisk metode uden at oprette et objekt
        Person.displaySpecies();  // Output: Species: Homo Sapiens

        // Opret to Person-objekter
        Person p1 = new Person();
        p1.name = "Alice";
        p1.age = 30;

        Person p2 = new Person();
        p2.name = "Bob";
        p2.age = 25;

        // Tilgå instansmetode (kræver et objekt)
        p1.displayInfo();  // Output: Name: Alice, Age: 30, Species: Homo Sapiens
        p2.displayInfo();  // Output: Name: Bob, Age: 25, Species: Homo Sapiens

        // Ændring af den statiske variabel via et objekt ændrer værdien for alle
        p1.species = "Homo Sapiens Sapiens";  // Ændrer species for alle objekter

        // Tjek den nye værdi af species
        Person.displaySpecies();  // Output: Species: Homo Sapiens Sapiens
    }
}
