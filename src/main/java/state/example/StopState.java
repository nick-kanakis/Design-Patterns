package state.example;

/**
 * Created by Nicolas on 10/6/2018.
 */
public class StopState implements State {
    private Context context;

    public StopState(Context context) {
        this.context = context;
    }

    @Override
    public void start() {
        System.out.println("Player is starting...");
        context.setCurrentState(context.getStartState());
    }

    @Override
    public void stop() {
        System.out.println("Player is already stopped");

    }
}
