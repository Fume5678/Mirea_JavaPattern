package Task6.FactoryMethod;

public class FordCreator extends Creator{
    @Override
    public Car getInstance() {
        return new Ford();
    }
}
