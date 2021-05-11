package Task6.Builder;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizza(){
        pizza = new Pizza();
    }

    public abstract void buildTopping();

    public abstract void buildMeat();

    public abstract void buildFoundation();
}
