package command.example;

import command.example.functionalities.Lights;

/**
 * Created by Nicolas on 8/6/2018.
 */
public class LightsOffCommand implements Command{
    private Lights lights;

    public LightsOffCommand(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        System.out.println(lights.off());
    }
}
