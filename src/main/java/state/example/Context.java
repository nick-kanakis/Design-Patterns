package state.example;

/**
 * Created by Nicolas on 10/6/2018.
 */
public class Context {
    private State currentState;
    private State startState;
    private State stopState;

    public Context(){
        startState =  new StartState(this);
        stopState =  new StopState(this);
        currentState = startState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void start(){
        currentState.start();
    }

    public void stop(){
        currentState.stop();
    }

    public State getStartState() {
        return startState;
    }

    public State getStopState() {
        return stopState;
    }
}
