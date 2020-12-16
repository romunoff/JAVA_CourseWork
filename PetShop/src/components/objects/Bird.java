package components.objects;

import common.enums.AnimalType;

public class Bird extends Animal {

    public Bird(String name, String age, String breed, String ration, String yummy, String price) {
        super(AnimalType.BIRD, name, age, breed, ration, yummy, price);
    }

}
