package Task6.Builder;

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void getPizza(){
        pizzaBuilder.getPizza();
    }

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void constructPizza(){
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildTopping();
        pizzaBuilder.buildTopping();
        pizzaBuilder.buildFoundation();
    }
}
