package ua.epam.javacore.builder;

public class BuildComputerRunner {
    public static void main(String[] args) {
        Seller seller = new Seller();
        seller.setComputerBuilder(new HomeComputer());
        Computer computer = seller.buildComputer();
        System.out.println(computer);
    }
}
