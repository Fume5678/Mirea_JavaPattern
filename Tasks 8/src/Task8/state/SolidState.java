package Task8.state;

public class SolidState implements State{
    @Override
    public String getName() {
        return "Solid";
    }

    @Override
    public void freeze(StateContext context) {
        System.out.println("Nothing");
    }

    @Override
    public void heat(StateContext context) {
        context.setState(new LiquidState());
    }
}
