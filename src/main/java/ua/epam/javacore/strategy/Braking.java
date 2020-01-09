package ua.epam.javacore.strategy;

public class Braking implements Activity {
    @Override
    public void doIt() {
        System.out.println("Braking to the stop");
    }
}
