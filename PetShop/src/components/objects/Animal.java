package components.objects;

import common.enums.AnimalType;

public abstract class Animal {

    private final AnimalType animalType;
    private final String name;
    private final String age;
    private final String breed;
    private final String ration;
    private final String yummy;
    private final String price;

    public Animal(AnimalType animalType, String name, String age, String breed, String ration, String yummy, String price) {
        this.animalType = animalType;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.ration = ration;
        this.yummy = yummy;
        this.price = price;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getRation() {
        return ration;
    }

    public String getYummy() {
        return yummy;
    }

    public String getPrice() {
        return price;
    }

}
