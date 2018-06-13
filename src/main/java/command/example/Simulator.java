package command.example;

import command.example.functionalities.Heater;
import command.example.functionalities.Lights;

/**
 * Created by Nicolas on 8/6/2018.
 */
public class Simulator {

    public static void main(String[] args) {
        Heater heater = new Heater();
        Lights lights = new Lights();

        Command[] cmds = new Command[5];

        cmds[0] = new AutumnModeHeaterCommand(heater);
        cmds[1] = new WinderModeHeaterCommand(heater);
        cmds[2] = new HeaterOffCommand(heater);
        cmds[3] = new LightsOnCommand(lights);
        cmds[4] = new LightsOffCommand(lights);

        for (Command cmd : cmds) {
            cmd.execute();
        }
    }
}
