package components;

public abstract class Animal {

    private final AnimalType animalType;
    private final String name;
    private final int age;
    private final String breed;
    private final String ration;
    private final String yummy;
    private final int price;

    public Animal(AnimalType animalType, String name, int age, String breed, String ration, String yummy, int price) {
        this.animalType = animalType;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.ration = ration;
        this.yummy = yummy;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + name + "] -> animal type [" + animalType.getType() + "]; breed [" + breed + "]. " +
                "Should eat [" + ration + "]. Favorite food is [" + yummy + "]. Price -> [" + price + "].";
    }

}
