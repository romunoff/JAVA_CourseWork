import components.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        Address address = new Address("San Francisco", "North Point Street E204A", 900);
        PetShop petStore = new PetShop("YAP Stores", address);

        while (true) {

            System.out.println("1. Add the animal to the register.");
            System.out.println("2. Remove the animal from the register.");
            System.out.println("3. Get a list of all the animals.");
            System.out.println("4. Sell the selected animal to the customer of the store.");
            System.out.println("5. Print sales amount for \"day\".");
            System.out.println("6. Save the registry to the repository.");
            System.out.println("7. Get the register from the repository.");
            System.out.println("8. Exit the program.");
            System.out.println();
            System.out.print("Select an action (1-8): ");

            String choice = scanner.next();

            if (choice.equals("1")) {

                System.out.print("Select the type of animal (Bird/Mammal): ");
                String animalType = (scanner.next()).toLowerCase();

                if (animalType.equals((AnimalType.BIRD.getType()).toLowerCase()) ||
                        animalType.equals((AnimalType.MAMMAL.getType()).toLowerCase())) {

                    System.out.print("Enter the name of the animal: ");
                    String name = scanner.next();
                    System.out.print("Enter the age of the animal: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter the breed of animal: ");
                    String breed = scanner.next();
                    System.out.print("Enter the animal's ration: ");
                    String ration = scanner.next();
                    System.out.print("Enter the animal's favorite yummy: ");
                    String yummy = scanner.next();
                    System.out.print("Enter the price of the animal: ");
                    int price = scanner.nextInt();

                    if (animalType.equals((AnimalType.BIRD.getType()).toLowerCase())) {
                        Animal bird = new Bird(name, age, breed, ration, yummy, price);
                        petStore.addToRegister(bird);
                    } else {
                        Animal mammal = new Mammal(name, age, breed, ration, yummy, price);
                        petStore.addToRegister(mammal);
                    }

                } else {
                    System.out.println("This type of animal doesn't exist.");
                }

            } else if (choice.equals("2")) {

                System.out.print("Enter the index of the animal in the list that you want to remove: ");
                int animalIndex = scanner.nextInt();

                if (petStore.removeFromRegister(animalIndex)) {
                    System.out.println("The animal has been successfully removed.");
                } else {
                    System.out.println("The animal wasn't found.");
                }

            } else if (choice.equals("3")) {

                Printer.printRegister(petStore.getRegister());

            } else if (choice.equals("4")) {

                System.out.print("Enter customer first name: ");
                String firstName = scanner.next();
                System.out.print("Enter customer last name: ");
                String lastName = scanner.next();
                System.out.print("Enter customer birthday year: ");
                int birthdayYear = scanner.nextInt();
                System.out.print("Enter customer passport: ");
                String passport = scanner.next();

                Customer customer = new Customer(firstName, lastName, birthdayYear, passport);

                System.out.print("Enter the index of the animal in the list that the customer wants to buy: ");
                int animalIndex = scanner.nextInt();

                if (petStore.sellAnimal(customer, animalIndex)) {
                    System.out.println("The animal has been successfully sold.");
                } else {
                    System.out.println("The animal wasn't found.");
                }

            } else if (choice.equals("5")) {

                Printer.printSales(petStore.getSales());

            } else if (choice.equals("6")) {

            } else if (choice.equals("7")) {

                String filePath = ".\\src\\files\\Persistence Storage.csv";
                String content = ReadFile.readFile(filePath);

                petStore.setRegister(DataParser.animalParser(content));

            } else if (choice.equals("8")) {
                return;
            } else {
                System.out.println("Enter a correct data.");
            }


            System.out.println();

        }

    }

}
