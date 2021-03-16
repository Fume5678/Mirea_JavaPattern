package Task6.Prototype;

public class Cookie implements Cloneable{
    protected int weight;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Cookie copy = (Cookie) super.clone();
        return copy;
    }
}
