package ua.epam.javacore.bridge;

public class OficcePC extends PC {

    protected OficcePC(Assembler collector) {
        super(collector);
    }

    public void assemblyComp() {
        System.out.println("Oficce PC building in progress");
        collector.createPC();
    }
}
