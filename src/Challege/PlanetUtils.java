package Challege;

import java.util.List;
import java.util.stream.Collectors;

public class PlanetUtils {

    public List<Planet> getPlanetBeginningWithM(List<Planet> planets) {
        return planets.stream().filter(item -> item.getName().startsWith("M")).collect(Collectors.toList());
    }

    public List<Planet> getPlanetsWithRings(List<Planet> planets) {
        return planets.stream().filter(planet -> planet.isHasRings()).collect(Collectors.toList());
    }

    public List<Planet> getPlanetWithMoreThanThreeMoons(List<Planet> planets) {
        return planets.stream().filter(planet -> planet.getNumberOfMoons() > 3).collect(Collectors.toList());
    }

    public List<Planet> getPlanetWithDensityGraterThanFive(List<Planet> planets) {
        return planets.stream().filter(planet -> planet.getDensity() > 5).collect(Collectors.toList());
    }
}
