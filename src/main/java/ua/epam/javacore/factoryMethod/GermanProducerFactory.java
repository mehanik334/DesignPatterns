package ua.epam.javacore.factoryMethod;

public class GermanProducerFactory implements ProducerFactory{

    public Producer createProducer() {
        return new GermanProducerCar();
    }
}
