package components;

import java.util.List;

public class OutputDataParser {

    public static String registerParser(List<Animal> register) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AnimalType,Name,Age,Breed,Ration,Yummy,Price").append(System.lineSeparator());
        for (Animal animal : register) {
            stringBuilder.append(animal.getAnimalType().getType()).append(",");
            stringBuilder.append(animal.getName()).append(",");
            stringBuilder.append(animal.getAge()).append(",");
            stringBuilder.append(animal.getBreed()).append(",");
            stringBuilder.append(animal.getRation()).append(",");
            stringBuilder.append(animal.getYummy()).append(",");
            stringBuilder.append(animal.getPrice()).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }

}
