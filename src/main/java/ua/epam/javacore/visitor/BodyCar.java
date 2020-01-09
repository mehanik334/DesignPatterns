package ua.epam.javacore.visitor;

public class BodyCar implements CarElement {
    @Override
    public void beCollect(Mechanic mechanic) {
        mechanic.create(this);
    }
}
