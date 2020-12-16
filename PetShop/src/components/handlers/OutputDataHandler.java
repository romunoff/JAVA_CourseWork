package components.handlers;

import components.objects.Animal;

import java.util.List;

public class OutputDataHandler {

    public static String registerParser(List<Animal> register, String separator) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("AnimalType").append(separator);
        stringBuilder.append("Name").append(separator);
        stringBuilder.append("Age").append(separator);
        stringBuilder.append("Breed").append(separator);
        stringBuilder.append("Ration").append(separator);
        stringBuilder.append("Yummy").append(separator);
        stringBuilder.append("Price").append(System.lineSeparator());

        for (Animal animal : register) {

            stringBuilder.append(animal.getAnimalType().getType()).append(separator);
            stringBuilder.append(animal.getName()).append(separator);
            stringBuilder.append(animal.getAge()).append(separator);
            stringBuilder.append(animal.getBreed()).append(separator);
            stringBuilder.append(animal.getRation()).append(separator);
            stringBuilder.append(animal.getYummy()).append(separator);
            stringBuilder.append(animal.getPrice()).append(System.lineSeparator());

        }

        return stringBuilder.toString();

    }

}
