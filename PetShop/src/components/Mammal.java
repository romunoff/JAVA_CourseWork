package components;

public class Mammal extends Animal {

    public Mammal(String name, int age, String breed, String ration, String yummy, int price) {
        super(AnimalType.MAMMAL, name, age, breed, ration, yummy, price);
    }

}
