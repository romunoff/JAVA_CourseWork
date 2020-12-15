package components;

import java.util.List;
import java.util.Map;

public class Printer {

    public static void printRegister(List<Animal> register) {
        if (register.isEmpty()) {
            System.out.println("Animal register is empty.");
        } else {
            for (int i = 0; i < register.size(); i++) {
                System.out.println((i + 1) + " : [" + register.get(i).getName() + "] -> animal type [" + register.get(i).getAnimalType().getType() +
                        "]; breed [" + register.get(i).getBreed() + "]. Should eat [" + register.get(i).getRation() + "]. Favorite food is [" +
                        register.get(i).getYummy() + "]. Price -> [" + register.get(i).getPrice() + "].");
            }
        }
    }

    public static void printSales(Map<Customer, Animal> sales) {
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
