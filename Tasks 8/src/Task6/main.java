package Task6;

import Task6.AbstractFactory.*;
import Task6.Builder.MozarellaBuilder;
import Task6.Builder.Pizza;
import Task6.Builder.PizzaBuilder;
import Task6.Builder.Waiter;
import Task6.FactoryMethod.Car;
import Task6.FactoryMethod.Creator;
import Task6.FactoryMethod.FordCreator;
import Task6.Prototype.CocuntCookie;
import Task6.Prototype.Cookie;
import Task6.Prototype.CookieMachine;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Factory Methods
        Creator creator = new FordCreator();
        Car my_ford = creator.getInstance();
        System.out.println(my_ford.name);

        // Abstract Factory
        FordFactory fordFactory = new FordFactory();
        ToyotaFactory toyotaFactory = new ToyotaFactory();
        Sedan ford_sedan = fordFactory.createSedan();
        Coupe toyota_coupe = toyotaFactory.createCoupe();

        // Builder
        PizzaBuilder pizzaBuilder = new MozarellaBuilder();
        Waiter waiter = new Waiter();
        waiter.setPizzaBuilder(pizzaBuilder);
        waiter.constructPizza();
        Pizza pizza = pizzaBuilder.getPizza();

        // Cookie Machine
        Cookie tempCookie = null;
        Cookie prot = new CocuntCookie();
        CookieMachine cm = new CookieMachine(prot);
        for(int i = 0; i < 100; i++){
            tempCookie = cm.makeCookie();
        }
    }
}
