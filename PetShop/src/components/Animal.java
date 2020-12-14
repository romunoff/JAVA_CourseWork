package components;

public abstract class Animal {

    private AnimalType animalType;
    private String name;
    private int age;
    private String breed;
    private String ration;
    private String yummy;
    private int price;

    public Animal(AnimalType animalType, String name, int age, String breed, String ration, String yummy, int price) {
        this.animalType = animalType;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.ration = ration;
        this.yummy = yummy;
        this.price = price;
    }

}
