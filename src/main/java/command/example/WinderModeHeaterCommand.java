package command.example;

import command.example.functionalities.Heater;

/**
 * Created by Nicolas on 8/6/2018.
 */
public class WinderModeHeaterCommand implements Command {
    private Heater heater;

    public WinderModeHeaterCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void execute() {
        System.out.println(heater.on());
        System.out.println(heater.setTemperature(25));
    }
}
