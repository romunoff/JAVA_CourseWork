package components;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DataParser {

    public static List<Animal> animalParser(String string) {

        List<Animal> list = new ArrayList<>();
        String[] rows = StringUtils.split(string, System.lineSeparator());

        for (int i = 1; i < rows.length; i++) {

            String[] rowElements = StringUtils.split(rows[i], ",");

            String animalType = (rowElements[0]).toLowerCase();
            String name = rowElements[1];
            int age = Integer.parseInt(rowElements[2]);
            String breed = rowElements[3];
            String ration = rowElements[4];
            String yummy = rowElements[5];
            int price = Integer.parseInt(rowElements[6]);

            if (animalType.equals((AnimalType.BIRD.getType()).toLowerCase())) {
                Animal bird = new Bird(name, age, breed, ration, yummy, price);
                list.add(bird);
            } else if (animalType.equals((AnimalType.MAMMAL.getType()).toLowerCase())) {
                Animal mammal = new Mammal(name, age, breed, ration, yummy, price);
                list.add(mammal);
            }

        }

        return list;

    }

}
