package ua.epam.javacore.memento;

public class Car {

    private SaveState saveState;

    public SaveState getSaveState() {
        return saveState;
    }

    public void setSaveState(SaveState saveState) {
        this.saveState = saveState;
    }
}
