package Challege;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

    public static List<Planet> getPlanet() {
        List<Planet> planet = new ArrayList<>();
        Planet mercury = new Planet("mercury");
        mercury.setDensity(5.43);
        mercury.setHasRings(false);
        mercury.setNumberOfMoons(0);

        Planet venus = new Planet("venus");
        venus.setDensity(5.24);
        venus.setHasRings(false);
        venus.setNumberOfMoons(0);

        Planet earth = new Planet("earth");
        earth.setDensity(5.52);
        earth.setHasRings(false);
        earth.setNumberOfMoons(1);

        Planet mars = new Planet("mars");
        mars.setDensity(3.94);
        mars.setHasRings(false);
        mars.setNumberOfMoons(2);

        Planet jupiter = new Planet("jupiter");
        jupiter.setDensity(1.33);
        jupiter.setHasRings(true);
        jupiter.setNumberOfMoons(80);

        Planet saturn = new Planet("saturn");
        mars.setDensity(0.70);
        mars.setHasRings(true);
        mars.setNumberOfMoons(33);

        Planet uranus = new Planet("uranus");
        uranus.setDensity(1.30);
        uranus.setHasRings(true);
        uranus.setNumberOfMoons(27);

        Planet neptune = new Planet("neptune");
        neptune.setDensity(1.76);
        neptune.setHasRings(true);
        neptune.setNumberOfMoons(14);

        planet.add(mercury);
        planet.add(venus);
        planet.add(earth);
        planet.add(mars);
        planet.add(jupiter);
        planet.add(saturn);
        planet.add(uranus);
        planet.add(neptune);

        return planet;
    }
}
