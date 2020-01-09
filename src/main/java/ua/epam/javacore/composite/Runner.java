package ua.epam.javacore.composite;

public class Runner {
    public static void main(String[] args) {
        RaceTeam raceTeam = new RaceTeam();
        Ingeneer firstMechanicIngeneer = new Mechanic();
        Ingeneer secondMechanicIngeneer = new Mechanic();
        Ingeneer designerIngeneer = new Designer();

        raceTeam.addIngeneer(firstMechanicIngeneer);
        raceTeam.addIngeneer(secondMechanicIngeneer);
        raceTeam.addIngeneer(designerIngeneer);

        raceTeam.createRaceCar();
    }
}
