package components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetShop {

    private final String name;
    private final Address address;
    private final List<Animal> register;

    private Map<Customer, Animal> sales;

    public PetShop(String name, Address address) {
        this.name = name;
        this.address = address;
        register = new ArrayList<>();
        sales = new HashMap<>();
    }

    public void addToRegister(Animal animal) {
        register.add(animal);
    }

    public boolean removeFromRegister(int index) {
        if (index > 0 && index <= register.size()) {
            register.remove(index - 1);
            return true;
        } else return false;
    }

    public void printRegister() {
        if (register.isEmpty()) {
            System.out.println("Animal register is empty.");
        } else {
            for (int i = 0; i < register.size(); i++) {
                System.out.println((i + 1) + " : " + register.get(i).toString());
            }
        }
    }

    public boolean sellAnimal(Customer customer, int index) {
        if (index > 0 && index <= register.size()) {
            sales.put(customer, register.get(index - 1));
            register.remove(index - 1);
            return true;
        } else return false;
    }

    public void printSales() {
        if (sales.isEmpty()) {
            System.out.println("Sales is empty.");
        } else {
            for (Customer customer : sales.keySet()) {
                System.out.println(customer.getFirstName() + " " + customer.getLastName() + " bought a " + sales.get(customer).getAnimalType() +
                        " named " + sales.get(customer).getName() + " with the " + sales.get(customer).getBreed() + " breed");
            }
        }
    }

}
