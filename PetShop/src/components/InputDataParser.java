package components;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class InputDataParser {

    public static List<Animal> registerParser(String string, String separator) {

        List<Animal> list = new ArrayList<>();
        String[] rows = StringUtils.split(string, System.lineSeparator());

        for (int i = 1; i < rows.length; i++) {

            String[] rowElements = StringUtils.split(rows[i], separator);

            String animalType = rowElements[0];
            String name = rowElements[1].toLowerCase();
            String age = rowElements[2];
            String breed = rowElements[3];
            String ration = rowElements[4];
            String yummy = rowElements[5];
            String price = rowElements[6];

            if (Integer.parseInt(animalType) == AnimalType.BIRD.getType()) {
                Animal bird = new Bird(name, age, breed, ration, yummy, price);
                list.add(bird);
            } else if (Integer.parseInt(animalType) == AnimalType.MAMMAL.getType()) {
                Animal mammal = new Mammal(name, age, breed, ration, yummy, price);
                list.add(mammal);
            }

        }

        return list;

    }

}
