package ua.epam.javacore.visitor;

public class Engine implements CarElement {
    @Override
    public void beCollect(Mechanic mechanic) {
        mechanic.create(this);
    }
}
