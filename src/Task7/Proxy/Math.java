package Task7.Proxy;

public class Math implements IMath{
    @Override
    public double add(double x, double y) {
        return x+y;
    }

    @Override
    public double sub(double x, double y) {
        return x-y;
    }
}
