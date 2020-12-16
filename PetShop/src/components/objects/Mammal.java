package components.objects;

import common.enums.AnimalType;

public class Mammal extends Animal {

    public Mammal(String name, String age, String breed, String ration, String yummy, String price) {
        super(AnimalType.MAMMAL, name, age, breed, ration, yummy, price);
    }

}
