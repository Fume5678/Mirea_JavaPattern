package Task8.state;

public class LiquidState  implements State{
    @Override
    public String getName() {
        return "Liquid";
    }

    @Override
    public void freeze(StateContext context) {
        context.setState(new SolidState());
    }

    @Override
    public void heat(StateContext context) {
        System.out.println("Nothing");
    }
}
