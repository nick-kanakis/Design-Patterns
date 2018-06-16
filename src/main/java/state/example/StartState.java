package state.example;

/**
 * Created by Nicolas on 10/6/2018.
 */
public class StartState implements State {
    private Context context;

    public StartState(Context context) {
        this.context = context;
    }

    @Override
    public void start() {
        System.out.println("Player is already started");
    }

    @Override
    public void stop() {
        System.out.println("Player is stopping...");
        context.setCurrentState(context.getStopState());
    }
}
