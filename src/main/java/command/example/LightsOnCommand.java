package command.example;

import command.example.functionalities.Lights;

/**
 * Created by Nicolas on 8/6/2018.
 */
public class LightsOnCommand implements Command {
    private Lights lights;

    public LightsOnCommand(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        System.out.println(lights.on());
    }
}
