package Task7.Proxy;

public class MathProxy implements IMath{
    private Math math;

    public double add(double x, double y) {
        lazyInitMath();
        return math.add(x, y);
    }

    public double sub(double x, double y){
        lazyInitMath();
        return math.add(x, y);
    }


    private void lazyInitMath(){
        if(math == null){
            math = new Math();
        }
    }
}
