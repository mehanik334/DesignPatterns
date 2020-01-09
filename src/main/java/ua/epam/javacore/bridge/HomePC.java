package ua.epam.javacore.bridge;

public class HomePC extends PC {

    protected HomePC(Assembler collector) {
        super(collector);
    }

    public void assemblyComp() {
        System.out.println("HomePC building in progress");
        collector.createPC();
    }
}
