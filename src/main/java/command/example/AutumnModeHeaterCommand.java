package command.example;

import command.example.functionalities.Heater;

/**
 * Created by Nicolas on 8/6/2018.
 */
public class AutumnModeHeaterCommand implements Command {
    private Heater heater;

    public AutumnModeHeaterCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void execute() {
        System.out.println(heater.on());
        System.out.println(heater.setTemperature(17));
    }
}
