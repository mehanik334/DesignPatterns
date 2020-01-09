package ua.epam.javacore.builder;

public class HomeComputer extends ComputerBuilder {
    public void buildCpu() {
        computer.setCpu(new Cpu("Intel i3"));
    }

    public void buildHdd() {
        computer.setHdd(new Hdd("WD",500));
    }

    public void buildPrice() {
        computer.setPrice(1500);
    }
}
