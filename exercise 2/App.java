import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet earth = new Earth();
        Planet neptune = new Neptune();
        Planet pluto = new Pluto();
        Planet venus = new Venus();
        Planet uranus = new Uranus();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        earth.accept(astronaut);
        neptune.accept(astronaut);
        pluto.accept(astronaut);
        venus.accept(astronaut);
        uranus.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        earth.accept(rover);
        neptune.accept(rover);
        pluto.accept(rover);
        venus.accept(rover);
        uranus.accept(rover);

    }
}