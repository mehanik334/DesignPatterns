package ua.epam.javacore.builder;

public class Seller {

    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer buildComputer() {
        computerBuilder.createComputer();
        computerBuilder.buildCpu();
        computerBuilder.buildHdd();
        computerBuilder.buildPrice();

        Computer computer = computerBuilder.getComputer();
        return computer;
    }
}
