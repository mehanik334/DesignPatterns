package ua.epam.javacore.visitor;

public class Transmission implements CarElement{
    @Override
    public void beCollect(Mechanic mechanic) {
        mechanic.create(this);
    }
}
