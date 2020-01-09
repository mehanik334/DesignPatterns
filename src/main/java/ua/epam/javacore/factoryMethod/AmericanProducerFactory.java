package ua.epam.javacore.factoryMethod;

public class AmericanProducerFactory implements ProducerFactory {
    public Producer createProducer() {
        return new AmericanProducerCar();
    }
}
