package Task8.state;

public interface State {
    String getName();
    void freeze(StateContext context);
    void heat(StateContext context);
}
