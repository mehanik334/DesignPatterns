package ua.epam.javacore.abstractFactory;

public class HouseTeamFactory implements HomeTeamFactory {
    public Builder getBuilder() {
        return new BuilderHouse();
    }

    public Foreman getForeman() {
        return new ForemanBuilderHouse();
    }
}
