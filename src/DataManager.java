import java.util.ArrayList;

public class DataManager {
    private ArrayList<State> states;

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    public DataManager(ArrayList<State> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
