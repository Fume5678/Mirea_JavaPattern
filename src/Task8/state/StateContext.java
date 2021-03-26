package Task8.state;

public class StateContext {
    private State state = new SolidState();


    public void heat(){
        System.out.println("Heating a " + state.getName());
        state.heat(this);
    }

    public void freeze(){
        System.out.println("Heating a " + state.getName());
        state.freeze(this);
    }

    public State getState(State state) {
        return state;
    }

    public void setState(State state) {
        System.out.println("Changing of stay. Now: " + state.getName() +  "...");
        this.state = state;
    }
}
