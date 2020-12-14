package components;

import java.util.ArrayList;
import java.util.List;

public class PetShop {

    private final String name;
    private final Address address;
    private final List<Animal> register;

    public PetShop(String name, Address address) {
        this.name = name;
        this.address = address;
        register = new ArrayList<>();
    }

    public void addToRegister(Animal animal) {
        register.add(animal);
    }

    public void printRegister() {
        if (register.isEmpty()) {
            System.out.println("Animal register is empty.");
        } else {
            for (Animal animal : register) {
                System.out.println(animal.toString());
            }
        }
    }

}
