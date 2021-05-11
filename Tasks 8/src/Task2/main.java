package Task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();

        System.out.println((int)(Math.random() * 100) % 28);
        for(int i = 0; i < 15; i++) {
            humans.add(new Human(
                    "f00" + Integer.toString(i),
                    "s00" + Integer.toString(i),
                    (int)(Math.random() * 1000) % 100));
            humans.get(i).setWeight((int)(Math.random() * 1000) % 100);

            humans.get(i).setBirthDay(LocalDate.of(
                    (int)(Math.random() * 10000) % 3080,
                    (int)(Math.random() * 100) % 11+1,
                    (int)(Math.random() * 100) % 28+1));
        }
        Stream<Human> stream = humans.stream();

        System.out.println("Before map: " + humans);
        stream.forEach(human -> human.setWeight(human.getWeight() - 5));

        stream = humans.stream();
        System.out.println("\nAfter map: " + humans);
        System.out.println("\nHumans until 03.02.1990: " + Arrays.toString(stream.filter(human -> LocalDate.of(1999, 2, 3).compareTo(human.getBirthDay()) > 0).toArray()));

        stream = humans.stream();
        System.out.println("\nConcatenate: " +  stream.map(Human::getlName).collect(Collectors.joining(" ")));
    }
}
