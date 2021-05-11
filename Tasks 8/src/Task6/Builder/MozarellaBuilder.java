package Task6.Builder;

public class MozarellaBuilder extends PizzaBuilder{
    public MozarellaBuilder() {
        System.out.println("Mozareall builder");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Cheese");
    }

    @Override
    public void buildMeat() {
        pizza.setMeat("Cheese");
    }

    @Override
    public void buildFoundation() {
        pizza.setFoundation("French bread");
    }
}
