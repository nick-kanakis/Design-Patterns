package command.example;

import command.example.functionalities.Heater;

/**
 * Created by Nicolas on 8/6/2018.
 */
public class HeaterOffCommand implements Command {
    private Heater heater;

    public HeaterOffCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void execute() {
        System.out.println(heater.off());
    }
}
