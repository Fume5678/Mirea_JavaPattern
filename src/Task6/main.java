package Task6;

import Task6.FactoryMethod.Car;
import Task6.FactoryMethod.Creator;
import Task6.FactoryMethod.FordCreator;

public class main {
    public static void main(String[] args) {
        Creator creator = new FordCreator();
        Car my_ford = creator.getInstance();
        System.out.println(my_ford.name);

    }
}
