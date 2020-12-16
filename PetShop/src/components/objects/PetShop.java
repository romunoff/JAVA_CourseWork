package components.objects;

import java.util.*;

public class PetShop {

    private final String name;
    private final Address address;
    private List<Animal> register;
    private final Map<Customer, Animal> sales;

    public PetShop(String name, Address address) {
        this.name = name;
        this.address = address;
        register = new ArrayList<>();
        sales = new HashMap<>();
    }

    public List<Animal> getRegister() {
        return register;
    }

    public Map<Customer, Animal> getSales() {
        return sales;
    }

    public void setRegister(List<Animal> register) {
        this.register = register;
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

    public boolean sellAnimal(Customer customer, int index) {
        if (index > 0 && index <= register.size()) {
            sales.put(customer, register.get(index - 1));
            register.remove(index - 1);
            return true;
        } else return false;
    }

}
