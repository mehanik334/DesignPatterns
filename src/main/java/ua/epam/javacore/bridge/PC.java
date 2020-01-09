package ua.epam.javacore.bridge;

public abstract class PC {

    protected Assembler collector;

    protected PC(Assembler collector) {
        this.collector = collector;
    }

    public abstract void assemblyComp();


}
