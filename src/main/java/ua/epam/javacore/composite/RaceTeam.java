package ua.epam.javacore.composite;

import java.util.ArrayList;
import java.util.List;

public class RaceTeam {

    private List<Ingeneer> ingeneers = new ArrayList<Ingeneer>();

    public void addIngeneer(Ingeneer ingeneer) {
        ingeneers.add(ingeneer);
    }

    public void removeIngeneer(Ingeneer ingeneer) {
        ingeneers.remove(ingeneer);
    }

    public void createRaceCar() {
        System.out.println("Race team create race car");
        for (Ingeneer ingeneer: ingeneers) {
            ingeneer.work();
        }
    }
}
