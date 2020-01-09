package ua.epam.javacore.abstractFactory;

public class House {
    public static void main(String[] args) {
        HomeTeamFactory factory = new HouseTeamFactory();
        Builder builder = factory.getBuilder();
        Foreman foreman = factory.getForeman();

        System.out.println("Building house : ");
        builder.build();
        foreman.contolBuilding();
    }
}
