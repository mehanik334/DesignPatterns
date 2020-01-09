package ua.epam.javacore.singleton;

public class CreatePlanet {

    public static void main(String[] args) {
        PlanetSingleton newPlanet = PlanetSingleton.getInstance();
        newPlanet.setName("EpamPlanet");
        System.out.println(newPlanet);
    }
}
