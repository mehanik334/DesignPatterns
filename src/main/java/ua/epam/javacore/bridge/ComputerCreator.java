package ua.epam.javacore.bridge;

public class ComputerCreator {

    public static void main(String[] args) {
        PC [] computers = { new HomePC(new HomeAssembler()),
                            new OficcePC(new ProAssembler())
                          };
        for (PC computer: computers) {
            computer.assemblyComp();
        }
    }
}
